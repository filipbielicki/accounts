package com.filipbielicki.SpringBootJAXRS.controllers;

import com.filipbielicki.SpringBootJAXRS.NotFoundException;
import com.filipbielicki.SpringBootJAXRS.data.DataRepository;
import com.filipbielicki.SpringBootJAXRS.data.DataService;
import com.filipbielicki.SpringBootJAXRS.models.Person;
import com.filipbielicki.SpringBootJAXRS.models.PersonDetails;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class AccountControllerTest {

    private AccountController accountController;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private DataRepository mockedDataRepository;

    @InjectMocks
    private DataService mockedDataService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        accountController = new AccountController(mockedDataService);
    }

    @Test
    public void shouldReturnAllClientsWithDetails() throws Exception {

        List<Person> personList = getAllPeople();

        mockedDataRepository.setPersonList(personList);

        when(accountController.getAllClientsData()).thenReturn(personList);

        List<Person> resultList = accountController.getAllClientsData();

        assertThat(resultList).isEqualTo(personList);
    }

    @Test
    public void shouldThrowNotFoundExceptionWhenPersonNotFound() throws Exception {

        thrown.expect(NotFoundException.class);
        mockedDataRepository.setPersonList(getAllPeople());

        when(accountController.getAccountBySurname("Cuma")).thenThrow(NotFoundException.class);

        List<Person> searchedPersons = accountController.getAccountBySurname("Cuma");

        assertThat(searchedPersons.size()).isEqualTo(0);
        assertThat(searchedPersons).isNull();
    }

    private List<Person> getAllPeople() {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom", "Bom", new PersonDetails(6990.50, 55, true)));
        personList.add(new Person("Kom", "Com", new PersonDetails(1540.25, 65, true)));
        personList.add(new Person("Pom", "Lom", new PersonDetails(4005.25, 19, false)));

        return personList;
    }
}
