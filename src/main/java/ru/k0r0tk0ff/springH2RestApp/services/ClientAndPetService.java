package ru.k0r0tk0ff.springH2RestApp.services;
import ru.k0r0tk0ff.springH2RestApp.model.Client;
import ru.k0r0tk0ff.springH2RestApp.model.Pet;

import java.util.Collection;

public interface ClientAndPetService {


    Client findOne(long id);

    Collection<Client> findAll();

    Collection<Pet> getAllPets();

    Client getPersonById();

    Collection getPetsByClientId(long clientId);

}
