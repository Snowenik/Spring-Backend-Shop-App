package com.shop.services;

import com.shop.dto.ProductCategoryDTO;
import com.shop.entities.Product;
import com.shop.entities.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DefaultProductService implements ProductService {


    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getProductByProductCategory(ProductCategoryDTO productCategoryDTO) {
        return productRepository.findByCategory(productCategoryDTO.getProductCategory());
    }
}














