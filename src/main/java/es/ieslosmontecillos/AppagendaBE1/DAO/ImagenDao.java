package es.ieslosmontecillos.AppagendaBE1.DAO;

import es.ieslosmontecillos.AppagendaBE1.Entity.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ImagenDao extends JpaRepository<Imagen, Long> {
}