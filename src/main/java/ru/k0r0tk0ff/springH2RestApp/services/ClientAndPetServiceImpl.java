package ru.k0r0tk0ff.springH2RestApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import ru.k0r0tk0ff.springH2RestApp.model.Client;
import ru.k0r0tk0ff.springH2RestApp.model.Pet;
import ru.k0r0tk0ff.springH2RestApp.repository.ClientRepository;
import ru.k0r0tk0ff.springH2RestApp.repository.PetRepository;

import java.util.Collection;

@Service
public class ClientAndPetServiceImpl implements ClientAndPetService {

    @Autowired
    private PetRepository petRepo;

    @Autowired
    private ClientRepository personRepo;

    @Override
    public Collection<Client> findAll() {
        return personRepo.findAll();
    }

    @Override
    public Client findOne(long id) {
        return personRepo.findOne(id);
    }

    @Override
    public Collection<Pet> getAllPets() {
        return petRepo.findAll();
    }

    @Override
    public Client getPersonById() {
        return null;
    }

    @Override
    public Collection getPetsByClientId(long clientId) {
        return null;
    }


}
