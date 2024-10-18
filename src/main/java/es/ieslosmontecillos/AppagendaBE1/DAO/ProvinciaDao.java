package es.ieslosmontecillos.AppagendaBE1.DAO;

import es.ieslosmontecillos.AppagendaBE1.Entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProvinciaDao extends JpaRepository<Provincia, Long> {
}