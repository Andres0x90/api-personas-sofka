package com.sofka.api.personas.repositories;

import com.sofka.api.personas.entities.Persona;
import org.springframework.data.repository.CrudRepository;

public interface InterfacePersonaRepository extends CrudRepository<Persona, Integer> {
}
