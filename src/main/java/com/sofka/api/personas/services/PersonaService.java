package com.sofka.api.personas.services;

import com.sofka.api.personas.entities.Persona;
import com.sofka.api.personas.repositories.InterfacePersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonaService implements InterfacePersonaService
{
    @Autowired
    InterfacePersonaRepository personaRepository;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona listarPorId(Integer id)
    {
        return personaRepository.findById(id).orElseThrow();
    }

    @Override
    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizar(Persona persona) {
        this.listarPorId(persona.getId());
        return personaRepository.save(persona);
    }

    @Override
    public Map<String, String> eliminar(Integer id) {
        this.listarPorId(id);

        personaRepository.deleteById(id);
        HashMap<String, String> response = new HashMap<>();
        response.put("Mensaje", "Persona eliminada correctamente");

        return response;
    }
}
