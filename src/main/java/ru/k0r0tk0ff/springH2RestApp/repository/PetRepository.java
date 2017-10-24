package ru.k0r0tk0ff.springH2RestApp.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ru.k0r0tk0ff.springH2RestApp.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}

