package com.filipbielicki.SpringBootJAXRS.models;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    private static final String PRODUCER = "XDXD";
    private static final String PROD_NAME = "STUFF";
    private static final Double PROD_PRICE = 45.69;
    private Product testedObject;

    @Before
    public void setUp() throws Exception {
        testedObject = new Product();
        testedObject.setProducer(PRODUCER);
        testedObject.setName(PROD_NAME);
        testedObject.setPrice(PROD_PRICE);
    }

    @Test
    public void shouldCreateObject() throws Exception {
        assertThat(testedObject).isNotNull();
        assertThat(testedObject.getProducer()).isEqualTo("XDXD");
        assertThat(testedObject.getName()).isEqualTo("STUFF");
        assertThat(testedObject.getPrice()).isEqualTo(45.69);
    }
}
