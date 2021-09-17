package com.shop.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "transactions")
public class Transaction {


    @Id
    @GeneratedValue
    private Long id;

    private Date date;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "transaction", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Product> productList;


    public void addProduct(Product product) {
        productList.add(product);
        product.setTransaction(this);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
        product.setTransaction(null);
    }

    public Transaction() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, user, productList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transaction transaction = (Transaction) o;
        return Objects.equals(id, transaction.id) &&
                Objects.equals(date, transaction.date) &&
                Objects.equals(user, transaction.user) &&
                Objects.equals(productList, transaction.productList);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id = '" + id + '\'' +
                ", date= '" + date + '\'' +
                ", user='" + user + '\'' +
                ", productList= '" + productList + '\'' +
                '}';
    }

}



















