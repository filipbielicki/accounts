package com.filipbielicki.SpringBootJAXRS.controllers;

import com.filipbielicki.SpringBootJAXRS.data.DataService;
import com.filipbielicki.SpringBootJAXRS.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/products")
public class ProductController {

    private DataService dataService;

    public ProductController(DataService dataService) {
        this.dataService = dataService;
    }

    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    @GET
    @Path("/getall")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProducts() {

        return dataService.getProductData();
    }
}
