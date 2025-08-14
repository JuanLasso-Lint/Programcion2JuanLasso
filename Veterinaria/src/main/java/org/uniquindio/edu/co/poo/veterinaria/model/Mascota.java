package org.uniquindio.edu.co.poo.veterinaria.model;

public class Mascota {
    private String nombre;
    private Especie especie;
    private String raza;
    private int edad;
    private String númerodeIdentificaciónVeterinaria;
    private Dueño dueño;
    private Historial historial;


    public Mascota(String nombre, Especie especie, String raza, int edad, String númerodeIdentificaciónVeterinaria) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.númerodeIdentificaciónVeterinaria = númerodeIdentificaciónVeterinaria;
        this.historial = new Historial();

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Especie getEspecie() {
        return especie;
    }
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNúmerodeIdentificaciónVeterinaria() {
        return númerodeIdentificaciónVeterinaria;
    }
    public void setNúmerodeIdentificaciónVeterinaria(String númerodeIdentificaciónVeterinaria) {
        this.númerodeIdentificaciónVeterinaria = númerodeIdentificaciónVeterinaria;
    }
    public Dueño getDueño() {
        return dueño;
    }
    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    public Historial getHistorial() {
        return historial;
    }
    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie=" + especie +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", númerodeIdentificaciónVeterinaria='" + númerodeIdentificaciónVeterinaria + '\'' +
                ", dueño=" + dueño +
                '}';
    }
}
