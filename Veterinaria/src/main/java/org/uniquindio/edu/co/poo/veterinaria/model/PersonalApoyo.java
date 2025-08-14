package org.uniquindio.edu.co.poo.veterinaria.model;

public class PersonalApoyo extends Persona {

    private String numeroEmpleado;

    public PersonalApoyo(String nombre, String apellido, String numeroIdentificacion,
                         String telefono, String direccion, String numeroEmpleado) {
        super(nombre, apellido, numeroIdentificacion, telefono, direccion);
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }
    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "PersonalApoyo{" +
                "numeroEmpleado='" + numeroEmpleado + '\'' +
                '}';
    }
}
