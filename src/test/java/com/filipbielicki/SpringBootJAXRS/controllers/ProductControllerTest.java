package com.filipbielicki.SpringBootJAXRS.controllers;

import com.filipbielicki.SpringBootJAXRS.data.DataRepository;
import com.filipbielicki.SpringBootJAXRS.data.DataService;
import com.filipbielicki.SpringBootJAXRS.models.Product;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductControllerTest {

    private ProductController productController;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void shouldReturnAllProducts() throws Exception {

        DataRepository mockedDataRepository = mock(DataRepository.class);
        DataService mockedDataService = mock(DataService.class);
        productController = new ProductController(mockedDataService);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("XXX", "Tableta", 55.69));
        productList.add(new Product("XXY", "Tabletka", 53.69));
        productList.add(new Product("XYX", "Tabletki", 58.69));

        mockedDataRepository.setProductList(productList);

        when(productController.getAllProducts()).thenReturn(productList);

        List<Product> resultList = productController.getAllProducts();

        assertThat(resultList).isEqualTo(productList);
    }
}
