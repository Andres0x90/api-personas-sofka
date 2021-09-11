package com.sofka.api.personas.services;

import com.sofka.api.personas.entities.Persona;
import com.sofka.api.personas.repositories.InterfacePersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonaService implements InterfacePersonaService
{
    @Autowired
    InterfacePersonaRepository personaRepository;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona listarPorId(Integer id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return null;
    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }

    @Override
    public Persona eliminar(Integer id) {
        return null;
    }
}
