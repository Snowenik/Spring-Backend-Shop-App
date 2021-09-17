package com.shop.controllers;


import com.shop.dto.ProductCategoryDTO;
import com.shop.entities.Product;
import com.shop.services.DefaultProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {


    @Autowired
    private DefaultProductService defaultProductService;


    @PostMapping("/products")
    public @ResponseBody List<Product> getProducts(@RequestBody ProductCategoryDTO productCategoryDTO) {
        return defaultProductService.getProductByProductCategory(productCategoryDTO);
    }


}

















