package com.sofka.api.personas.controllers;

import com.sofka.api.personas.entities.Persona;
import com.sofka.api.personas.services.InterfacePersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/personas")
public class PersonaController
{
    @Autowired
    InterfacePersonaService personaService;

    @GetMapping("/listar")
    public Iterable<Persona> listarPersonas()
    {
        return personaService.listar();
    }

    @GetMapping("/listar/{id}")
    public Persona listarPorId(@PathVariable Integer id)
    {
        return personaService.listarPorId(id);
    }

    @PostMapping("/guardar")
    public Persona guardar(@RequestBody Persona persona)
    {
        return personaService.guardar(persona);
    }

    @PutMapping("/actualizar")
    public Persona actualizar(@RequestBody Persona persona)
    {
        return personaService.actualizar(persona);
    }

    @DeleteMapping("/eliminar/{id}")
    public Map<String, String> eliminar(@PathVariable Integer id)
    {
        return personaService.eliminar(id);
    }
}
