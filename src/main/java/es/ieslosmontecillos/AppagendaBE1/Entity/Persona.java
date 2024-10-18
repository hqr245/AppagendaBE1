package es.ieslosmontecillos.AppagendaBE1.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="PERSONA")
public class Persona {


    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;

    @Basic
    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;

    @Basic
    @Column(name = "TELEFONO", nullable = true, length = 15)
    private String telefono;

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 30)
    private String email;

    @ManyToOne
    @JoinColumn(name = "PROVINCIA")
    private Provincia provincia;

    @Basic
    @Column(name = "FECHA_NACIMIENTO", nullable = true)
    private Date fechaNacimiento;

    @Basic
    @Column(name = "NUM_HIJOS", nullable = true)
    private short numHijos;

    @Basic
    @Column(name = "ESTADO_CIVIL", nullable = true, length = 1)
    private String estado_civil;

    @Basic
    @Column(name = "SALARIO", nullable = true, precision = 9, scale = 2)
    private BigDecimal salario;

    @Basic
    @Column(name = "JUBILADO", nullable = true)
    private short jubilado;

    @ManyToOne
    @JoinColumn(name = "FOTO")
    private Imagen foto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public short getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(short numHijos) {
        this.numHijos = numHijos;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public short getJubilado() {
        return jubilado;
    }

    public void setJubilado(short jubilado) {
        this.jubilado = jubilado;
    }


    public Imagen getFoto() {
        return foto;
    }

    public void setFoto(Imagen foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return getNumHijos() == persona.getNumHijos()
                && getJubilado() == persona.getJubilado()
                && Objects.equals(getId(), persona.getId())
                && Objects.equals(getNombre(), persona.getNombre())
                && Objects.equals(getApellidos(), persona.getApellidos())
                && Objects.equals(getTelefono(), persona.getTelefono())
                && Objects.equals(getEmail(), persona.getEmail())
                && Objects.equals(getProvincia(), persona.getProvincia())
                && Objects.equals(getFechaNacimiento(), persona.getFechaNacimiento())
                && Objects.equals(getEstado_civil(), persona.getEstado_civil())
                && Objects.equals(getSalario(), persona.getSalario())
                && Objects.equals(getFoto(), persona.getFoto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(),
                getApellidos(), getTelefono(),
                getEmail(), getProvincia(),
                getFechaNacimiento(), getNumHijos(),
                getEstado_civil(), getSalario(),
                getJubilado(), getFoto());
    }
}
