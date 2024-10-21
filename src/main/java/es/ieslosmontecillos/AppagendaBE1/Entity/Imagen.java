package es.ieslosmontecillos.AppagendaBE1.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name="IMAGEN")
public class Imagen implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UUID", nullable = false)
    private Long uuid;

    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;

    @Basic
    @Column(name = "TIPO", nullable = false, length = 10)
    private String tipo;

    @Lob
    @Column(name = "DATOS",nullable = false, columnDefinition="MEDIUMBLOB")
    private byte[] data;

    public Long getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imagen imagen = (Imagen) o;
        return Objects.equals(getUuid(), imagen.getUuid()) && Objects.equals(getNombre(), imagen.getNombre()) && Objects.equals(getTipo(), imagen.getTipo()) && Objects.deepEquals(getData(), imagen.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getNombre(), getTipo(), Arrays.hashCode(getData()));
    }
}