package com.filipbielicki.SpringBootJAXRS;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class NotFoundException extends WebApplicationException {

    public NotFoundException(){
        super(Response.status(404).build());
    }
}
