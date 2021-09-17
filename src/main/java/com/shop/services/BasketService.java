package com.shop.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shop.dto.BasketTransactionDTO;
import com.shop.dto.ProductBasketDTO;
import com.shop.exceptions.*;

public interface BasketService {


    String addToBasket(ProductBasketDTO productDTO) throws UserDoesntExistException, ProductDoesntExistsException;
    String removeFromBasket(ProductBasketDTO productBasketDTO) throws UserDoesntExistException, ProductDoesntExistsException;
    String buyProducts(BasketTransactionDTO basketTransactionDTO) throws NotEnoughMoneyException, EmptyBasketException, ProductNotAvailableException, JsonProcessingException;
}
