package com.filipbielicki.SpringBootJAXRS.models;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDetailsTest {

    private static final Double SAVINGS = 10111.11;
    private static final Integer AGE = 44;
    private static final Boolean MARRIED = true;
    private PersonDetails testedObject;

    @Before
    public void setUp() throws Exception {
        testedObject = new PersonDetails();
        testedObject.setSavings(SAVINGS);
        testedObject.setAge(AGE);
        testedObject.setMarried(MARRIED);
    }

    @Test
    public void shouldCreateObject() throws Exception {
        assertThat(testedObject).isNotNull();
        assertThat(testedObject.getSavings()).isEqualTo(10111.11);
        assertThat(testedObject.getAge()).isEqualTo(44);
        assertThat(testedObject.getMarried()).isEqualTo(true);
    }
}
