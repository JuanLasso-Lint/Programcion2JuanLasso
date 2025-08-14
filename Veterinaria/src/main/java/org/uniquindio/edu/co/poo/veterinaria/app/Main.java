package org.uniquindio.edu.co.poo.veterinaria.app;

import org.uniquindio.edu.co.poo.veterinaria.model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria("Peluditos", "Centro", "123");
            Mascota mascota1 = new Mascota("Milu", Especie.PERRO, "Sanss",2,"258");
            Mascota mascota2 = new Mascota("Lola", Especie.AVE, "Loro", 1,"13413");
            Dueño dueño1 = new Dueño("Juan","Lasso","1089","31143","B.provi");
            Dueño dueño2 = new Dueño("María", "Pérez", "2098", "3124567890", "B. San José");
            Dueño dueño3 = new Dueño("Carlos", "Ramírez", "3154", "3109876543", "B. El Prado");
            Dueño dueño4 = new Dueño("Luisa", "Fernández", "4187", "3137654321", "B. La Floresta");
            Dueño dueño5 = new Dueño("Pedro", "Martínez", "5271", "3001122334", "B. Santa Ana");
            Dueño dueño6 = new Dueño("Ana", "Gómez", "6392", "3209988776", "B. San Fernando");

        Veterinario veterinario = new Veterinario("Nombre","Apellido","12258",
                    "35811","587523", "525", Especialidad.AnimalesExoticos);
            Tratamiento tratamiento1 = new Tratamiento("olopata","3 dias", "jdiahc8yebcak");
            Consulta consulta = new Consulta("5586",LocalDate.now(),LocalTime.now(),"Jnciwenciuwenci",tratamiento1);

            Cita cita = new Cita("123",dueño1,veterinario ,LocalDate.now(), LocalTime.now(),"Sede centro", "Consultorio numero 2");
            Cita cita2 = new Cita("124", dueño2, veterinario, LocalDate.of(2025, 8, 14), LocalTime.of(9, 30), "Sede norte", "Chequeo general");
            Cita cita3 = new Cita("125", dueño6, veterinario, LocalDate.of(2025, 8, 15), LocalTime.of(14, 0), "Sede centro", "Vacunación anual");
            Cita cita4 = new Cita("126", dueño3, veterinario, LocalDate.of(2025, 8, 15), LocalTime.of(11, 15), "Sede sur", "Consulta dermatológica");
            Cita cita5 = new Cita("127", dueño2, veterinario, LocalDate.of(2025, 8, 15), LocalTime.of(16, 45), "Sede norte", "Control post-operatorio");
            Cita cita6 = new Cita("128", dueño4, veterinario, LocalDate.of(2025, 8, 18), LocalTime.of(10, 0), "Sede centro", "Radiografía preventiva");
            Cita cita7 = new Cita("124", dueño1, veterinario, LocalDate.now(), LocalTime.now().plusHours(1), "Sede norte", "Chequeo general");
            Cita cita8 = new Cita("125", dueño1, veterinario, LocalDate.now(), LocalTime.now().plusHours(2), "Sede centro", "Vacunación anual");
            Cita cita9 = new Cita("126", dueño1, veterinario, LocalDate.now(), LocalTime.now().plusHours(3), "Sede sur", "Consulta dermatológica");
            Cita cita10 = new Cita("127", dueño1, veterinario, LocalDate.now(), LocalTime.now().plusHours(4), "Sede norte", "Control post-operatorio");
            Cita cita11 = new Cita("128", dueño1, veterinario, LocalDate.now(), LocalTime.now().plusHours(5), "Sede centro", "Radiografía preventiva");


            veterinaria.registrarMascota(mascota1, dueño1);
            veterinaria.registrarMascota(mascota2, dueño1);
            veterinaria.registrarPersona(veterinario);
            veterinaria.registrarPersona(dueño1);
            veterinaria.registrarCita(cita);
            veterinaria.registrarCita(cita);
            veterinaria.registrarCita(cita2);
            veterinaria.registrarCita(cita3);
            veterinaria.registrarCita(cita4);
            veterinaria.registrarCita(cita5);
            veterinaria.registrarCita(cita6);
            veterinaria.registrarCita(cita7);
            veterinaria.registrarCita(cita8);
            veterinaria.registrarCita(cita9);
            veterinaria.registrarCita(cita10);
            veterinaria.registrarCita(cita11);
            veterinaria.registrarConsulta("258",consulta);



        //System.out.println(cita);
        //System.out.println(mascota2.getDueño());
        //System.out.println(dueño1.getMascotas());
        //System.out.println(veterinaria.obtenerHistorialMascota("258"));
        System.out.println(veterinaria.obtenerCitasDia(LocalDate.of(2025, 8, 15)));




        }
}
