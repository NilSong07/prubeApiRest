package com.example.prube.demo;
import java.util.Objects;
import javax.persistence.*;
//notas
@Entity 
@Table(name = "usuario")
public class  UsuarioModel {

    @Id;
    @GeneretedValue(strategy = GenerationType.IDENTITY);
    @Column(unique = true, nullable =false);
    private String usuario;

    private String nombre;
    private String email;
    private String estado;

    public UsuarioModel() {
    }

    public UsuarioModel(String usuario, String nombre, String email, String estado) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.email = email;
        this.estado = estado;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public UsuarioModel usuario(String usuario) {
        setUsuario(usuario);
        return this;
    }

    public UsuarioModel nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public UsuarioModel email(String email) {
        setEmail(email);
        return this;
    }

    public UsuarioModel estado(String estado) {
        setEstado(estado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioModel)) {
            return false;
        }
        UsuarioModel usuarioModel = (UsuarioModel) o;
        return Objects.equals(usuario, usuarioModel.usuario) && Objects.equals(nombre, usuarioModel.nombre) && Objects.equals(email, usuarioModel.email) && Objects.equals(estado, usuarioModel.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, nombre, email, estado);
    }

    @Override
    public String toString() {
        return "{" +
            " usuario='" + getUsuario() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", email='" + getEmail() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }



}