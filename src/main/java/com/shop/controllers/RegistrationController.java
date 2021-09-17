package com.shop.controllers;


import com.shop.dto.UserRegisterDTO;
import com.shop.exceptions.UserAlreadyExistsException;
import com.shop.services.DefaultRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationController {


    @Autowired
    private DefaultRegistrationService defaultRegistrationService;


    @PostMapping("/user/create")
    public @ResponseBody
    String createNewUser(@RequestBody UserRegisterDTO userRegisterDTO) throws UserAlreadyExistsException {
        return defaultRegistrationService.createNewAccount(userRegisterDTO);
    }


}
