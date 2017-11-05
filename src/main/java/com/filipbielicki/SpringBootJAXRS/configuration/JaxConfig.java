package com.filipbielicki.SpringBootJAXRS.configuration;


import com.filipbielicki.SpringBootJAXRS.controllers.AccountController;
import com.filipbielicki.SpringBootJAXRS.controllers.ProductController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JaxConfig extends ResourceConfig {

    public JaxConfig(){
        registerEndpoints();
    }

    private void registerEndpoints(){
        register(AccountController.class);
        register(ProductController.class);
    }
}
