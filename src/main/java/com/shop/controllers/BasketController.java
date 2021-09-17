package com.shop.controllers;


import com.shop.dto.BasketTransactionDTO;
import com.shop.dto.ProductBasketDTO;
import com.shop.exceptions.ProductDoesntExistsException;
import com.shop.exceptions.UserDoesntExistException;
import com.shop.services.DefaultBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasketController {


    @Autowired
    private DefaultBasketService defaultBasketService;


    @PostMapping("/user/addToBasket")
    public @ResponseBody
    String addToBasket(@RequestBody ProductBasketDTO productBasketDTO) throws UserDoesntExistException, ProductDoesntExistsException {
        return defaultBasketService.addToBasket(productBasketDTO);
    }

    @PostMapping("/user/removeFromBasket")
    public @ResponseBody
    String removeFromBasket(@RequestBody ProductBasketDTO productBasketDTO) throws UserDoesntExistException, ProductDoesntExistsException {
        return defaultBasketService.removeFromBasket(productBasketDTO);
    }

    @PostMapping("/user/buy")
    public @ResponseBody
    String buyProducts(@RequestBody BasketTransactionDTO basketTransactionDTO) throws Exception {
        return defaultBasketService.buyProducts(basketTransactionDTO);
    }

}





