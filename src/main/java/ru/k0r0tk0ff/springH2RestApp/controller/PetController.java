package ru.k0r0tk0ff.springH2RestApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.k0r0tk0ff.springH2RestApp.model.Pet;
import ru.k0r0tk0ff.springH2RestApp.services.ClientAndPetServiceImpl;

import java.util.Collection;

@RestController
public class PetController {

    @Autowired
    private ClientAndPetServiceImpl repo;


    @RequestMapping(value = "/getAllPets", method = RequestMethod.GET)
    public ResponseEntity<Collection<Pet>> getAllPets() {
        return new ResponseEntity<>(repo.getAllPets(), HttpStatus.OK);
    }
}
