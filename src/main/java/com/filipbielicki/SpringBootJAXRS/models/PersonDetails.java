package com.filipbielicki.SpringBootJAXRS.models;

import org.springframework.stereotype.Component;

@Component
public class PersonDetails {

    private Double savings;
    private Integer age;
    private Boolean isMarried;

    public PersonDetails(Double savings, Integer age, Boolean isMarried) {
        this.savings = savings;
        this.age = age;
        this.isMarried = isMarried;
    }

    public PersonDetails() {
    }

    public Double getSavings() {
        return savings;
    }

    public void setSavings(Double savings) {
        this.savings = savings;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }
}
