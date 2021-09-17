package com.shop.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shop.dto.BasketTransactionDTO;
import com.shop.dto.ProductBasketDTO;
import com.shop.entities.*;
import com.shop.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DefaultBasketService implements BasketService {


    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public String addToBasket(ProductBasketDTO productDTO) throws UserDoesntExistException, ProductDoesntExistsException {
        if (!userRepository.existsById(productDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + productDTO.getUserId() + " nie istnieje");
        }
        User user = userRepository.findById(productDTO.getUserId()).get();
        if (!productRepository.existsById(productDTO.getProductId())) {
            throw new ProductDoesntExistsException("Produkt o id: " + productDTO.getProductId() + " nie istnieje");
        }
        Product product = productRepository.findByName(productDTO.getName());
        user.getBasket().addProduct(product);
        return "Produkt został dodany do koszyka";
    }

    @Override
    public String removeFromBasket(ProductBasketDTO productBasketDTO) throws UserDoesntExistException, ProductDoesntExistsException {
        if (!userRepository.existsById(productBasketDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + productBasketDTO.getUserId() + " nie istnieje");
        }
        User user = userRepository.findById(productBasketDTO.getUserId()).get();
        if (!productRepository.existsById(productBasketDTO.getProductId())) {
            throw new ProductDoesntExistsException("Produkt o id: " + productBasketDTO.getProductId() + " nie istnieje");
        }
        Product product = productRepository.findByName(productBasketDTO.getName());
        user.getBasket().removeProduct(product);
        return "Produkt został usunięty z koszyka";
    }

    @Override
    public String buyProducts(BasketTransactionDTO basketTransactionDTO) throws NotEnoughMoneyException, EmptyBasketException, JsonProcessingException, ProductNotAvailableException {
        User user = userRepository.findById(basketTransactionDTO.getUserId()).get();
        BigDecimal total = new BigDecimal(0);
        ObjectMapper mapper = new ObjectMapper();
        List<Long> productList = mapper.readValue(basketTransactionDTO.getProducts(), new TypeReference<List<Long>>() {
        });
        if (productList.size() <= 0) {
            throw new EmptyBasketException("Twój koszyk jest pusty");
        }
        for (Long productId : productList) {
            Product product = productRepository.findById(productId).get();
            total = total.add(product.getValue());
        }
        if (user.getAmount().compareTo(total) < 0) {
            throw new NotEnoughMoneyException("Nie posiadasz wystarczającej ilości środków");
        }
        for (Product product : user.getBasket().getProducts()) {
            if (!product.isInStock()) {
                throw new ProductNotAvailableException("Podany produkt jest aktualnie niedostępny");
            }
        }
        total = new BigDecimal(0);
        Transaction transaction = new Transaction();
        transaction.setProductList(new ArrayList<>());
        transactionRepository.save(transaction);
        user.getTransactions().size();
        user.addTransaction(transaction);
        transaction.setDate(new Date());
        for (Long productId : productList) {
            Product product = productRepository.findById(productId).get();
            product.setInStock(false);
            total = total.add(product.getValue());
            transaction.getProductList().size();
            transaction.addProduct(product);
            user.getBasket().removeProduct(product);
        }
        user.setAmount(user.getAmount().subtract(total));
        return "Twój zakup przebiegł pomyślnie";
    }
}













