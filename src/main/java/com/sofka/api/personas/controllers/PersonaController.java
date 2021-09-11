package com.sofka.api.personas.controllers;

import com.sofka.api.personas.entities.Persona;
import com.sofka.api.personas.services.InterfacePersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonaController
{
    @Autowired
    InterfacePersonaService personaService;

    @GetMapping("/listar-personas")
    public Iterable<Persona> listarPersonas()
    {
        return personaService.listar();
    }
}
