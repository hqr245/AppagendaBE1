package es.ieslosmontecillos.AppagendaBE1.Services;

import es.ieslosmontecillos.AppagendaBE1.DAO.ImagenDao;
import es.ieslosmontecillos.AppagendaBE1.Entity.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ImagenServiceImplement implements ImagenService {
    @Autowired
    private ImagenDao imagenDao;

    @Override
    public List<Imagen> findAll() {
        return (List<Imagen>) imagenDao.findAll();
    }

    @Override
    public Imagen save(Imagen Imagen) {
        return imagenDao.save(Imagen);
    }

    @Override
    public Imagen findById(Long id) {
        return imagenDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Imagen imagen) {
        imagenDao.delete(imagen);

    }
}