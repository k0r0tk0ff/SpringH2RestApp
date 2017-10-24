package ru.k0r0tk0ff.springH2RestApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.k0r0tk0ff.springH2RestApp.model.Client;
import ru.k0r0tk0ff.springH2RestApp.model.Pet;

import java.util.Collection;

/**
 * Created by user on 10/24/2017.
 */

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {

    Collection<Pet> findAll();

}

