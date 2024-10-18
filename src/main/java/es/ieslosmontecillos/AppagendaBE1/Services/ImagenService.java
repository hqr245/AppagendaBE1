package es.ieslosmontecillos.AppagendaBE1.Services;
import es.ieslosmontecillos.AppagendaBE1.Entity.Imagen;
import java.util.List;

public interface ImagenService {
    List<Imagen> findAll();
    Imagen save(Imagen Imagen);
    Imagen findById(Long id);
    void delete(Imagen magen);
}