package ru.k0r0tk0ff.springH2RestApp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ru.k0r0tk0ff.springH2RestApp.model.Person;
import ru.k0r0tk0ff.springH2RestApp.repository.PersonRepository;

@RestController
@RequestMapping("/clients")
public class PersonController {

	@Autowired
	private PersonRepository personRepo;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<Person>> getPeople() {
		return new ResponseEntity<>(personRepo.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> getClient (@PathVariable long id) {
		Person person = personRepo.findOne(id);

		if (person != null) {
			return new ResponseEntity<>(personRepo.findOne(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

/*	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addPerson(@RequestBody Person person) {
		return new ResponseEntity<>(personRepo.save(person), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletePerson(@PathVariable long id) {
		personRepo.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}*/
}
