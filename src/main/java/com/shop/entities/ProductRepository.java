package com.shop.entities;

import com.shop.enums.ProductCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {


    List<Product> findByCategory(ProductCategory productCategory);
    Product findByName(String name);
}
