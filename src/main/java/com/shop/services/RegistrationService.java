package com.shop.services;

import com.shop.dto.UserRegisterDTO;
import com.shop.exceptions.UserAlreadyExistsException;

public interface RegistrationService {


    String createNewAccount(UserRegisterDTO userRegisterDTO) throws UserAlreadyExistsException;




}
