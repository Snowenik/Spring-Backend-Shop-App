package com.shop.services;

import com.shop.dto.ProductCategoryDTO;
import com.shop.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByProductCategory(ProductCategoryDTO productCategoryDTO);
}
