package org.uniquindio.edu.co.poo.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

public class Dueño extends Persona {

    private List<Mascota> mascotas;

    public Dueño(String nombre, String apellido, String numeroIdentificacion, String telefono, String direccion) {
        super(nombre, apellido, numeroIdentificacion, telefono, direccion);
        this.mascotas = new ArrayList<>();
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    //este metodo asigna el dueño a la mascota o la lista de mascotas
    public void agrgarMascotas (Mascota mascota) {
        if (mascota.getDueño() != this) {
            mascota.setDueño(this);
        }
        if (!mascotas.contains(mascotas)){
            mascotas.add(mascota);
        }
    }

}
