package ru.k0r0tk0ff.springH2RestApp.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.k0r0tk0ff.springH2RestApp.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	
	Collection<Person> findAll();

}
