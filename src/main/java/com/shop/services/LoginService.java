package com.shop.services;

import com.shop.dto.UserLoginDTO;
import com.shop.entities.User;
import com.shop.exceptions.IncorrectLoginOrPasswordException;

public interface LoginService {

    User login(UserLoginDTO userLoginDTO) throws IncorrectLoginOrPasswordException;

}
