package ru.k0r0tk0ff.springH2RestApp.services;

import ru.k0r0tk0ff.springH2RestApp.model.Client;

import java.util.Collection;

/**
 * Created by user on 10/15/2017.
 */
public interface ClientAndPetService {

    Collection<Client> findAll();

    Client getPersonById();

    Collection getPetsByClientId(long clientId);

}
