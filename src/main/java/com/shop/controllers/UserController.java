package com.shop.controllers;


import com.shop.dto.*;
import com.shop.entities.Product;
import com.shop.entities.User;
import com.shop.entities.UserRepository;
import com.shop.exceptions.*;
import com.shop.models.AuthenticationRequest;
import com.shop.models.AuthenticationResponse;
import com.shop.services.DefaultUserService;
import com.shop.services.MyUserDetailsService;
import com.shop.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private DefaultUserService defaultUserService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getLogin(), authenticationRequest.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Nieprawidłowy login lub hasło");
        }

        final UserDetails userDetails = myUserDetailsService
                .loadUserByUsername(authenticationRequest.getLogin());

        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }


    @PostMapping("/user/basket")
    public @ResponseBody
    List<Product> getUserBasketProductList(@RequestBody UserBasketDTO userBasketDTO) throws UserDoesntExistException {
        return defaultUserService.getUserBasketProductList(userBasketDTO);
    }

    @PostMapping("/user/account/deposit")
    public @ResponseBody
    String depositMoney(@RequestBody UserAccountDTO userAccountDTO) throws UserDoesntExistException, InvalidMoneyDataException {
        return defaultUserService.depositMoney(userAccountDTO);
    }

    @PostMapping("/user/account/withdraw")
    public @ResponseBody
    String withdrawMoney(@RequestBody UserAccountDTO userAccountDTO) throws NotEnoughMoneyException, UserDoesntExistException, InvalidMoneyDataException {
        return defaultUserService.withdrawMoney(userAccountDTO);
    }

    @PostMapping("/user/account/balance")
    public @ResponseBody
    BigDecimal getUserBalance(@RequestBody UserBalanceDTO userBalanceDTO) throws UserDoesntExistException {
        return defaultUserService.getUserBalance(userBalanceDTO);
    }

    @PostMapping("/user/change/password")
    public @ResponseBody
    String changePassword(@RequestBody UserPasswordDTO userPasswordDTO) throws InvalidPasswordException, PasswordsDontMatchException, UserDoesntExistException {
        return defaultUserService.changePassword(userPasswordDTO);
    }

    @PostMapping("/user/change/email")
    public @ResponseBody
    String changeEmail(@RequestBody UserEmailDTO userEmailDTO) throws EmailAlreadyExistsException, UserDoesntExistException {
        return defaultUserService.changeEmail(userEmailDTO);
    }

    @PostMapping("/user/get")
    public @ResponseBody
    User getUser(@RequestBody UserDTO userDTO) throws UserDoesntExistException {
        return defaultUserService.getUser(userDTO);
    }
}


















