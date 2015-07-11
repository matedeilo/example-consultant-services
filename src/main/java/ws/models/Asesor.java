package ws.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "asesor")
public class Asesor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int codigo;

    // The user's email
    @NotNull
    private String nombre;

    @NotNull
    private String correo;

    @ManyToOne
    @JoinColumn(columnDefinition="integer", name="sede")
    private Sede sede;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
