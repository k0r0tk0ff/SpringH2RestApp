package ru.k0r0tk0ff.springH2RestApp.services;

import ru.k0r0tk0ff.springH2RestApp.model.Person;

import java.util.Collection;

/**
 * Created by user on 10/15/2017.
 */
public class ClientAndPetServiceImpl implements ClientAndPetService {
    @Override
    public Collection<Person> findAll() {
        return null;
    }

    @Override
    public Person getPersonById() {
        return null;
    }

    @Override
    public Collection getPetsByClientId(long clientId) {
        return null;
    }
}
