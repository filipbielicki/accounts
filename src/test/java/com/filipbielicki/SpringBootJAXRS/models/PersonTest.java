package com.filipbielicki.SpringBootJAXRS.models;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    private static final String NAME = "WILLIAM";
    private static final String LAST_NAME = "SMITH";
    private Person testedObject;

    @Before
    public void setUp() throws Exception {
        testedObject = new Person();
        testedObject.setFirstName(NAME);
        testedObject.setLastName(LAST_NAME);
    }

    @Test
    public void shouldCreateObject() throws Exception {
        assertThat(testedObject).isNotNull();
        assertThat(testedObject.getFirstName()).isEqualTo("WILLIAM");
        assertThat(testedObject.getLastName()).isEqualTo("SMITH");
    }
}
