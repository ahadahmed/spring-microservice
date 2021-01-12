package com.maico.ms.productservice.controller.rest;

import javax.persistence.*;

/**
 * @author ahadahmed - 1/12/21
 * @see <a href="#"> see this</a>
 */

@Entity
@Table(name ="product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;

    public Product(){

    }

    public Product(Long id, String productName, String description, Double price){
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
