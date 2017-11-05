package com.filipbielicki.SpringBootJAXRS.data;

import com.filipbielicki.SpringBootJAXRS.models.PersonDetails;
import com.filipbielicki.SpringBootJAXRS.models.Person;
import com.filipbielicki.SpringBootJAXRS.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataService {

    private DataRepository dataRepository;

    public List<Person> getPersonData(){
        return dataRepository.getPersonList();
    }

    public List<PersonDetails> getDetailsData(){
        return dataRepository.getPersonDetailsList();
    }

    public List<Product> getProductData(){
        return dataRepository.getProductList();
    }

    @Autowired
    public void setDataRepository(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
}
