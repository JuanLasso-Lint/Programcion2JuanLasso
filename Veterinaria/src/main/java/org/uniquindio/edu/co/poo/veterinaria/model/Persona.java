package org.uniquindio.edu.co.poo.veterinaria.model;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String numeroId;
    private String telefono;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroIdentificacion, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroId = numeroIdentificacion;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Get and Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNumeroIde() {
        return numeroId;
    }
    public void setNumeroIdentificacion(String numeroId) {
        this.numeroId = numeroId;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroIdentificacion='" + numeroId + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
