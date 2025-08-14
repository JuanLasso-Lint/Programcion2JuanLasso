package org.uniquindio.edu.co.poo.veterinaria.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());


    Veterinaria veterinaria = new Veterinaria("Peluditos", "Centro", "123");

    @Test
    public void registrarMascota() {
        LOG.info("Registrando mascota prueba");
        Mascota mascota1 = new Mascota("Milu", Especie.PERRO, "Sanss",2,"258");
        Mascota mascota2 = new Mascota("Lola", Especie.AVE, "Loro", 1,"13413");

        veterinaria.registrarMascota(mascota1);
        veterinaria.registrarMascota(mascota2);

        System.out.println(veterinaria.getListaMascotas());

        LOG.info("Registrando mascota prueba");


    }

  
}