package com.shop.services;

import com.shop.dto.*;
import com.shop.entities.Product;
import com.shop.entities.TransactionRepository;
import com.shop.entities.User;
import com.shop.entities.UserRepository;
import com.shop.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class DefaultUserService implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Product> getUserBasketProductList(UserBasketDTO userBasketDTO) throws UserDoesntExistException {
        if (!userRepository.existsById(userBasketDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + userBasketDTO.getUserId() + " nie istnieje");
        }
        User user = userRepository.findById(userBasketDTO.getUserId()).get();
        user.getBasket().getProducts().size();
        return user.getBasket().getProducts();
    }

    @Override
    public String depositMoney(UserAccountDTO userAccountDTO) throws UserDoesntExistException, InvalidMoneyDataException {
        if (!userRepository.existsById(userAccountDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + userAccountDTO.getUserId() + " nie istnieje");
        }
        if (userAccountDTO.getValue().compareTo(new BigDecimal(0)) <= 0) {
            throw new InvalidMoneyDataException("Podano niepoprawną kwotę");
        }
        User user = userRepository.findById(userAccountDTO.getUserId()).get();
        user.setAmount(user.getAmount().add(userAccountDTO.getValue()));
        return "Pomyślnie zdeponowano środki na koncie";
    }

    @Override
    public String withdrawMoney(UserAccountDTO userAccountDTO) throws NotEnoughMoneyException, UserDoesntExistException, InvalidMoneyDataException {
        if (!userRepository.existsById(userAccountDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + userAccountDTO.getUserId() + " nie istnieje");
        }
        if (userAccountDTO.getValue().compareTo(new BigDecimal(0)) <= 0) {
            throw new InvalidMoneyDataException("Podano niepoprawną kwotę");
        }
        User user = userRepository.findById(userAccountDTO.getUserId()).get();
        if (user.getAmount().compareTo(userAccountDTO.getValue()) < 0) {
            throw new NotEnoughMoneyException("Nie posiadasz wystarczającej ilości środków");
        }
        user.setAmount(user.getAmount().subtract(userAccountDTO.getValue()));
        return "Pomyślnie wypłacono środki z konta";
    }

    @Override
    public BigDecimal getUserBalance(UserBalanceDTO userBalanceDTO) throws UserDoesntExistException {
        if (!userRepository.existsById(userBalanceDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + userBalanceDTO.getUserId() + " nie istnieje");
        }
        return userRepository.findById(userBalanceDTO.getUserId()).get().getAmount();
    }


    @Override
    public String changePassword(UserPasswordDTO userPasswordDTO) throws InvalidPasswordException, PasswordsDontMatchException, UserDoesntExistException {
        if (!userRepository.existsById(userPasswordDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + userPasswordDTO.getUserId() + " nie istnieje");
        }
        User user = userRepository.findById(userPasswordDTO.getUserId()).get();
        if (!passwordEncoder.matches(userPasswordDTO.getOldPassword(), user.getPassword())) {
            throw new InvalidPasswordException("Podano nieprawidłowe obecne hasło");
        }
        if (!userPasswordDTO.getNewPassword().equals(userPasswordDTO.getRepeatedPassword())) {
            throw new PasswordsDontMatchException("Podane hasła różnią się od siebie");
        }
        user.setPassword(passwordEncoder.encode(userPasswordDTO.getNewPassword()));
        return "Pomyślnie zmieniono hasło";
    }

    @Override
    public String changeEmail(UserEmailDTO userEmailDTO) throws EmailAlreadyExistsException, UserDoesntExistException {
        if (!userRepository.existsById(userEmailDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + userEmailDTO.getUserId() + " nie istnieje");
        }
        User user = userRepository.findById(userEmailDTO.getUserId()).get();
        if (userRepository.findByEmail(userEmailDTO.getNewEmail()) != null) {
            throw new EmailAlreadyExistsException("Podany email jest już zajęty");
        }
        user.setEmail(userEmailDTO.getNewEmail());
        return "Pomyślnie zmieniono email";
    }

    @Override
    public User getUser(UserDTO userDTO) throws UserDoesntExistException {
        if (!userRepository.findById(userDTO.getUserId()).isPresent()) {
            throw new UserDoesntExistException("User o id: " + userDTO.getUserId() + " nie istnieje");
        }
        return userRepository.findById(userDTO.getUserId()).get();
    }
}



















