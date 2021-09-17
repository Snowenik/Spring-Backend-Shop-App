package com.shop.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "baskets")
public class Basket {

    @Id
    @GeneratedValue
    private Long id;

    private Long numberOfItems;

    private BigDecimal basketValue;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    @JsonIgnore
    @OneToMany(mappedBy = "basket", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Product> products;


    public void addProduct(Product product) {
        products.add(product);
        product.setBasket(this);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        product.setBasket(null);
    }

    public Basket() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Long numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public BigDecimal getBasketValue() {
        return basketValue;
    }

    public void setBasketValue(BigDecimal basketValue) {
        this.basketValue = basketValue;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfItems, basketValue, user, products);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Basket basket = (Basket) o;
        return Objects.equals(id, basket.id) &&
                Objects.equals(numberOfItems, basket.numberOfItems) &&
                Objects.equals(basketValue, basket.basketValue) &&
                Objects.equals(user, basket.user) &&
                Objects.equals(products, basket.products);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id = '" + id + '\'' +
                ", numberOfItems= '" + numberOfItems + '\'' +
                ", basketValue= '" + basketValue + '\'' +
                ", user= '" + user + '\'' +
                ", products= '" + products + '\'' +
                '}';
    }

}











