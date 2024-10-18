package es.ieslosmontecillos.AppagendaBE1.DAO;

import es.ieslosmontecillos.AppagendaBE1.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long> {
}