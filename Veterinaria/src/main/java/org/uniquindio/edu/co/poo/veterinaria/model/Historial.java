package org.uniquindio.edu.co.poo.veterinaria.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Historial {



    private List<Consulta> consultas;

    public Historial() {
        this.consultas = new ArrayList<>();
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public Optional<Consulta> buscarConsultaPorFecha(LocalDate fecha) {
        return consultas.stream()
                .filter(c -> c.getFecha().equals(fecha))
                .findFirst();
    }

    public List<Consulta> buscarConsultasPorCodigo(String codigo) {
        return consultas.stream()
                .filter(c -> c.getCodigoConsulta().equalsIgnoreCase(codigo))
                .toList();
    }
}
