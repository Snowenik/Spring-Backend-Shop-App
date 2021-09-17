package com.shop.services;


import com.shop.dto.UserRegisterDTO;
import com.shop.entities.Basket;
import com.shop.entities.User;
import com.shop.entities.UserRepository;
import com.shop.exceptions.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
@Transactional
public class DefaultRegistrationService implements RegistrationService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String createNewAccount(UserRegisterDTO userRegisterDTO) throws UserAlreadyExistsException {
        if (checkIfUserExists(userRegisterDTO.getLogin(), userRegisterDTO.getEmail())) {
            throw new UserAlreadyExistsException("Podany email lub login jest zajety");
        }
        User user = new User();
        user.setLogin(userRegisterDTO.getLogin());
        user.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));
        user.setFirstName(userRegisterDTO.getFirstName());
        user.setLastName(userRegisterDTO.getLastName());
        user.setEmail(userRegisterDTO.getEmail());
        user.setAmount(new BigDecimal(0));
        user.addBasket(new Basket());
        userRepository.save(user);
        return "Twoje konto zostało utworzone pomyślnie";
    }

    public boolean checkIfUserExists(String login, String email) {
        return ((userRepository.findByLogin(login) != null) || (userRepository.findByEmail(email) != null));
    }


}











