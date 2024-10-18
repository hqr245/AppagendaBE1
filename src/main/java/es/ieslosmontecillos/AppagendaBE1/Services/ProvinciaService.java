package es.ieslosmontecillos.AppagendaBE1.Services;
import es.ieslosmontecillos.AppagendaBE1.Entity.Provincia;
import java.util.List;

public interface ProvinciaService {
     List<Provincia> findAll();
     Provincia save(Provincia provincia);
     Provincia findById(Long id);
     void delete(Provincia provincia);
}