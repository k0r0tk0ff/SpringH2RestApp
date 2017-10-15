package ru.k0r0tk0ff.springH2RestApp.services;

import ru.k0r0tk0ff.springH2RestApp.model.Person;

import java.util.Collection;

/**
 * Created by user on 10/15/2017.
 */
public interface ClientAndPetService {

    Collection<Person> findAll();

    Person getPersonById();

    Collection getPetsByClientId(long clientId);

}
