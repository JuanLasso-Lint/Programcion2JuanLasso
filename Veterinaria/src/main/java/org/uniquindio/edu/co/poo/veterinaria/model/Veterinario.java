package org.uniquindio.edu.co.poo.veterinaria.model;

public class Veterinario extends Persona {

    private String numeroLicencia;
    private Especialidad especialidad;


    public Veterinario (String nombre, String apellido, String numeroIdentificacion, String telefono,
                        String direccion, String numeroLicencia, Especialidad especialidad) {
        super(nombre, apellido, numeroIdentificacion, telefono, direccion);
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }
    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "numeroLicencia='" + numeroLicencia + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}

