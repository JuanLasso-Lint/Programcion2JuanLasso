package org.uniquindio.edu.co.poo.veterinaria.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private String idCita;
    private Dueño dueño;
    private Veterinario veterinario;
    private LocalDate fecha;
    private LocalTime hora;
    private String lugar;
    private String descripcion;


    public Cita(String idCita,Dueño dueño,Veterinario veterinario,LocalDate fecha, LocalTime hora, String lugar, String descripcion) {
        this.idCita = idCita;
        this.dueño = dueño;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    public String getIdCita() {
        return idCita;
    }
    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Dueño getDueño() {
        return dueño;
    }
    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "idCita='" + idCita + '\'' +
                "Dueño" + dueño +
                "Veterinario" + veterinario +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}





