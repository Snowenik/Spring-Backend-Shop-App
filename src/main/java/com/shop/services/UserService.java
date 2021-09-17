package com.shop.services;

import com.shop.dto.*;
import com.shop.entities.Product;
import com.shop.entities.User;
import com.shop.exceptions.*;

import java.math.BigDecimal;
import java.util.List;

public interface UserService {

    List<Product> getUserBasketProductList(UserBasketDTO userBasketDTO) throws UserDoesntExistException;
    String depositMoney(UserAccountDTO userAccountDTO) throws UserDoesntExistException, InvalidMoneyDataException;
    String withdrawMoney(UserAccountDTO userAccountDTO) throws NotEnoughMoneyException, UserDoesntExistException, InvalidMoneyDataException;
    BigDecimal getUserBalance(UserBalanceDTO userBalanceDTO) throws UserDoesntExistException;
    String changePassword(UserPasswordDTO userPasswordDTO) throws InvalidPasswordException, PasswordsDontMatchException, UserDoesntExistException;
    String changeEmail(UserEmailDTO userEmailDTO) throws EmailAlreadyExistsException, UserDoesntExistException;
    User getUser(UserDTO userDTO) throws UserDoesntExistException;
}
