package com.shop.services;

import com.shop.dto.UserLoginDTO;
import com.shop.entities.User;
import com.shop.entities.UserRepository;
import com.shop.exceptions.IncorrectLoginOrPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DefaultLoginService implements LoginService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User login(UserLoginDTO userLoginDTO) throws IncorrectLoginOrPasswordException {
        if (!isLoginAndPasswordCorrect(userLoginDTO.getLogin(), userLoginDTO.getPassword())) {
            throw new IncorrectLoginOrPasswordException("Niepoprawny login lub hasło");
        }
        return userRepository.findByLogin(userLoginDTO.getLogin());
    }

    public boolean isLoginAndPasswordCorrect(String login, String password) {
        User user = userRepository.findByLogin(login);
        if (user != null) {
            return passwordEncoder.matches(password, user.getPassword());
        }
        return false;
    }
}

















