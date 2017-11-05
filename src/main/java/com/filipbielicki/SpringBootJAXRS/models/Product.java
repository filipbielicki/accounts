package com.filipbielicki.SpringBootJAXRS.models;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private String producer;
    private String name;
    private Double price;

    public Product(String producer, String name, Double price) {
        this.producer = producer;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
