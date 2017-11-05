package com.filipbielicki.SpringBootJAXRS.configuration;

import com.filipbielicki.SpringBootJAXRS.data.DataRepository;
import com.filipbielicki.SpringBootJAXRS.models.PersonDetails;
import com.filipbielicki.SpringBootJAXRS.models.Person;
import com.filipbielicki.SpringBootJAXRS.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CommandLineRunnerConfiguration {

    @Autowired
    DataRepository dataRepository;

    @Bean
    CommandLineRunner addInitialDataToDB(DataRepository dataRepository) {

        return data -> {
            Person p1 = new Person("Capitan", "Nemo", new PersonDetails(60000.59,76, true));
            Person p2 = new Person("Tony", "Halik", new PersonDetails(3636.87, 54, true));
            Person p3 = new Person("Arkady", "Fiedler", new PersonDetails(6958.14,38, true));
            Person p4 = new Person("Pawel", "Strzelecki", new PersonDetails(1400.87,47, false));
            Person p5 = new Person("Edmund", "Strzelecki", new PersonDetails(5700.01,34, true));

            Product prod1 = new Product("AAA", "Tablet", 89.99);
            Product prod2 = new Product("BBB", "Mobile phone", 64.99);
            Product prod3 = new Product("CCC", "Smartwatch", 189.99);
            Product prod4 = new Product("DDD", "Laptop", 289.99);


            List<Person> personList = new ArrayList<>();
            List<PersonDetails> personDetailsList = new ArrayList<>();
            List<Product> productList = new ArrayList<>();
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            personList.add(p4);
            personList.add(p5);
            personDetailsList.add(p1.getPersonDetails());
            personDetailsList.add(p2.getPersonDetails());
            personDetailsList.add(p3.getPersonDetails());
            personDetailsList.add(p4.getPersonDetails());
            productList.add(prod1);
            productList.add(prod2);
            productList.add(prod3);
            productList.add(prod4);

            for (Person person : personList) {
                dataRepository.getPersonList().add(person);
            }

            for(PersonDetails detail : personDetailsList){
                dataRepository.getPersonDetailsList().add(detail);
            }

            for(Product product : productList){
                dataRepository.getProductList().add(product);
            }
        };
    }
}


