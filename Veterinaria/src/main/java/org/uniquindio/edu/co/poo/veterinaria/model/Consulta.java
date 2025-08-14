package org.uniquindio.edu.co.poo.veterinaria.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private String codigoConsulta;
    private LocalDate fecha;
    private LocalTime hora;
    private String diagnostico;
    private Tratamiento tratamiento;

    public Consulta(String codigoConsulta, LocalDate fecha, LocalTime hora, String diagnostico, Tratamiento tratamiento) {
        this.codigoConsulta = codigoConsulta;
        this.fecha = fecha;
        this.hora = hora;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public String getCodigoConsulta() {
        return codigoConsulta;
    }
    public void setCodigoConsulta(String codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
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
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public Tratamiento getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }


    @Override
    public String toString() {
        return "Consulta{" +
                "codigoConsulta='" + codigoConsulta + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento=" + tratamiento +
                '}';
    }
}
