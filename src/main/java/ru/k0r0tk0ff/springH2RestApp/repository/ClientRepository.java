package ru.k0r0tk0ff.springH2RestApp.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.k0r0tk0ff.springH2RestApp.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	
	Collection<Client> findAll();

}
