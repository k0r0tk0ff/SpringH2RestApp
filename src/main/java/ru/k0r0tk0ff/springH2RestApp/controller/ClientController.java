package ru.k0r0tk0ff.springH2RestApp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ru.k0r0tk0ff.springH2RestApp.model.Client;
import ru.k0r0tk0ff.springH2RestApp.model.Pet;
import ru.k0r0tk0ff.springH2RestApp.repository.ClientRepository;
import ru.k0r0tk0ff.springH2RestApp.repository.PetRepository;
import ru.k0r0tk0ff.springH2RestApp.services.ClientAndPetServiceImpl;

@RestController
@RequestMapping("/")
public class ClientController {

    @Autowired
    private ClientAndPetServiceImpl repo;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<Client>> getClients() {
		return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Client> getClient (@PathVariable long id) {
		Client client = repo.findOne(id);

		if (client != null) {
			return new ResponseEntity<>(repo.findOne(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}




/*	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addPerson(@RequestBody Client person) {
		return new ResponseEntity<>(personRepo.save(person), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletePerson(@PathVariable long id) {
		personRepo.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}*/
}
