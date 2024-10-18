package es.ieslosmontecillos.AppagendaBE1.Services;

import es.ieslosmontecillos.AppagendaBE1.DAO.PersonaDao;
import es.ieslosmontecillos.AppagendaBE1.Entity.Persona;
import es.ieslosmontecillos.AppagendaBE1.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImplement implements PersonaService
{
    @Autowired
    private PersonaDao personaDao;

    @Override
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public Persona findById(Long id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Persona persona) {
        personaDao.delete(persona);
    }
}