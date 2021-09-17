package com.shop.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shop.enums.ProductCategory;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;


    private String name;

    private String description;

    private String brand;


    private ProductCategory category;

    private BigDecimal value;

    private String image;

    private boolean inStock;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "basket_id")
    @JsonIgnore
    private Basket basket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id")
    @JsonIgnore
    private Transaction transaction;

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, brand, value, image, basket, inStock, transaction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(value, product.value) &&
                Objects.equals(image, product.image) &&
                Objects.equals(basket, product.basket) &&
                Objects.equals(inStock, product.inStock) &&
                Objects.equals(transaction, product.transaction);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id= '" + id + '\'' +
                ", name= '" + name + '\'' +
                ", description= '" + description + '\'' +
                ", brand= '" + brand + '\'' +
                ", value= '" + value + '\'' +
                ", image= '" + image + '\'' +
                ", inStock= '" + inStock + '\'' +
                ", basket= '" + basket + '\'' +
                ", transaction= '" + transaction + '\'' +
                '}';
    }


}

















