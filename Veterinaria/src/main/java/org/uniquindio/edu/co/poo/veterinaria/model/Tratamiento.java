package org.uniquindio.edu.co.poo.veterinaria.model;

public class Tratamiento {
    private String medicamento;
    private String tiempo;
    private String descripcion;


    public Tratamiento(String medicamento, String tiempo, String descripcion) {
        this.medicamento = medicamento;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }


    public String getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    public String getTiempo() {
        return tiempo;
    }
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "medicamento='" + medicamento + '\'' +
                ", tiempo='" + tiempo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
