package com.shop.controllers;


import com.shop.dto.UserLoginDTO;
import com.shop.entities.User;
import com.shop.exceptions.IncorrectLoginOrPasswordException;
import com.shop.services.DefaultLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @Autowired
    private DefaultLoginService defaultLoginService;


    @PostMapping("/user/login")
    public @ResponseBody
    User login(@RequestBody UserLoginDTO userLoginDTO) throws IncorrectLoginOrPasswordException {
        return defaultLoginService.login(userLoginDTO);
    }


}
