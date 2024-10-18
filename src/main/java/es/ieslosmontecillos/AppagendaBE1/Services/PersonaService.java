package es.ieslosmontecillos.AppagendaBE1.Services;

import es.ieslosmontecillos.AppagendaBE1.Entity.Persona;

import java.util.List;

public interface PersonaService
{
    public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona findById(Long id);
    public void delete(Persona persona);
}