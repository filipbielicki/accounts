package com.filipbielicki.SpringBootJAXRS.data;

import com.filipbielicki.SpringBootJAXRS.models.PersonDetails;
import com.filipbielicki.SpringBootJAXRS.models.Person;
import com.filipbielicki.SpringBootJAXRS.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataRepository {

    private List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    private List<PersonDetails> personDetailsList = new ArrayList<>();

    public List<PersonDetails> getPersonDetailsList() {
        return personDetailsList;
    }

    private List<Product> productList = new LinkedList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setPersonDetailsList(List<PersonDetails> personDetailsList) {
        this.personDetailsList = personDetailsList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
