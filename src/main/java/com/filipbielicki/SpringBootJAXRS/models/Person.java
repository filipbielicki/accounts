package com.filipbielicki.SpringBootJAXRS.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String firstName;
    private String lastName;
    private PersonDetails personDetails;

    public Person(String firstName, String lastName, PersonDetails personDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personDetails = personDetails;
    }

    public Person() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Autowired
    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
