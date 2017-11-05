package com.filipbielicki.SpringBootJAXRS.controllers;

import com.filipbielicki.SpringBootJAXRS.NotFoundException;
import com.filipbielicki.SpringBootJAXRS.data.DataService;
import com.filipbielicki.SpringBootJAXRS.models.PersonDetails;
import com.filipbielicki.SpringBootJAXRS.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("/accounts")
public class AccountController {

    private DataService dataService;

    public AccountController(DataService dataService) {
        this.dataService = dataService;
    }

    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    @GET
    @Path("/getall")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllClientsData() {
        return dataService.getPersonData();
    }

    @GET
    @Path("/totalsavings")
    @Produces(MediaType.APPLICATION_JSON)
    public Double getTotalClientsSavings() {

        Double totalSavings = 0.0;
        List<PersonDetails> personDetailsList = dataService.getDetailsData();

        for (PersonDetails personDetails : personDetailsList) {
            totalSavings += personDetails.getSavings();
        }
        return totalSavings;
    }

    @GET
    @Path("/find/{surname}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAccountBySurname(@PathParam("surname") String surname) throws NotFoundException{

        List<Person> personListToSearch = dataService.getPersonData();
        List<Person> resultList = new ArrayList<>();

        for (Person person : personListToSearch) {
            if (person.getLastName().equalsIgnoreCase(surname)) {
                resultList.add(person);
            }
        }

        if (resultList.size() != 0) {
            return resultList;
        }
        else {
            throw new NotFoundException();
        }
    }
}
