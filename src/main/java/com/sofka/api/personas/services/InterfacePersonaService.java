package com.sofka.api.personas.services;

import com.sofka.api.personas.entities.Persona;

import java.util.List;

public interface InterfacePersonaService
{
    public List<Persona> listar();
    public Persona listarPorId(Integer id);
    public Persona guardar(Persona persona);
    public Persona actualizar(Persona persona);
    public void eliminar(Integer id);
}
