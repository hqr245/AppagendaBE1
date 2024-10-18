package es.ieslosmontecillos.AppagendaBE1.Controller;


import es.ieslosmontecillos.AppagendaBE1.Entity.Imagen;
import es.ieslosmontecillos.AppagendaBE1.Services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ImagenController {
    @Autowired
    private ImagenService imagenService;

    @GetMapping(value="/IMAGEN")
    public ResponseEntity<Object> getImagen(){
        Map<String,Object> map = new HashMap<>();

        try{
            List<Imagen> list =imagenService.findAll();
            return new ResponseEntity<>(list,HttpStatus.OK);
        }catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value="/IMAGEN")
    public ResponseEntity<Object> create(@RequestBody Imagen imagen){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Imagen res = imagenService.save(imagen);
            return new ResponseEntity<Object>(res,HttpStatus.OK);
        }
        catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/IMAGEN/{id}")
    public ResponseEntity<Object> update(@RequestBody Imagen imagen, @PathVariable long id){
        Map<String, Object> map = new HashMap<>();

        try {
            Imagen currentImagen= imagenService.findById(id);
            currentImagen.setNombre(imagen.getNombre());
            currentImagen.setTipo(imagen.getTipo());
            currentImagen.setData(imagen.getData());

            Imagen res = imagenService.save(currentImagen);
            return new ResponseEntity<Object>(res,HttpStatus.OK);
        }catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/IMAGEN/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){

        Map<String, Object> map = new HashMap<>();
        try {
            Imagen currentImagen= imagenService.findById(id);
            imagenService.delete(currentImagen);
            map.put("deleted", true);
            return new ResponseEntity<>(map, HttpStatus.OK);
        }catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
