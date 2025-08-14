package org.uniquindio.edu.co.poo.veterinaria.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Veterinaria {

    private String nombre;
    private String ubicacion;
    private String nit;
    private List<Mascota> listaMascotas;
    private List<Persona> listaPersonas;
    private List<Cita> listaCitas;


    //Constructor
    public Veterinaria(String nombre, String ubicacion, String nit) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaMascotas = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaCitas = new ArrayList<>();
    }

    //Get y Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }
    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }
    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    public List<Cita> getListaCitas() {
        return listaCitas;
    }
    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    //ToString
    @Override
    public String toString() {
        return "Veterinaria{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }


    //Crud Mascota
    public Optional<Mascota> buscarMascota(String númerodeIdVeterinaria) {
        Optional<Mascota> mascotaOptional = listaMascotas.stream().filter
                (mascota -> mascota.getNúmerodeIdentificaciónVeterinaria().equals(númerodeIdVeterinaria)).findFirst();
        return mascotaOptional;
    }
    public Optional<Mascota> registrarMascota(Mascota mascota, Dueño dueño) {
        Optional<Mascota> optionalMascota = buscarMascota(mascota.getNúmerodeIdentificaciónVeterinaria());

        if (optionalMascota.isPresent()) {
            System.out.println("La Mascota ya existe en el sistema");
            return optionalMascota;
        } else {
            dueño.agrgarMascotas(mascota); // Asociar mascota al dueño
            listaMascotas.add(mascota);
            System.out.println("Mascota registrada y asignada a " + dueño.getNombre());
            return Optional.of(mascota);
        }
    }
    public Optional<Mascota> editarMascota(String nombre, Especie especie, String raza, int edad, String númerodeIdentificaciónVeterinaria) {
        Optional<Mascota> mascotaOptional = buscarMascota(númerodeIdentificaciónVeterinaria);
        if (mascotaOptional.isPresent()) {
            Mascota mascota = mascotaOptional.get();
            mascota.setNombre(nombre);
            mascota.setRaza(raza);
            mascota.setEdad(edad);
            mascota.setEspecie(especie);
            System.out.println("Mascota editado");
        } else {
            System.out.println("La Mascota no existe en el sistema");
        }
        return mascotaOptional;
    }
    public Optional<Mascota> eliminarMascota(String númerodeIdentificaciónVeterinaria) {
        Optional<Mascota> mascotaOptional = buscarMascota(númerodeIdentificaciónVeterinaria);
        if (mascotaOptional.isPresent()) {
            listaMascotas.remove(mascotaOptional.get());
            System.out.println("Mascota eliminado");
        } else {
            System.out.println("La Mascota no existe en el sistema");
        }
        return mascotaOptional;
    }


    //Crud Persona
    public Optional<Persona> buscarPersona(String númeroIde) {
        Optional<Persona> personaOptional = listaPersonas.stream().filter
                (mascota -> mascota.getNumeroIde().equals(númeroIde)).findFirst();
        return personaOptional;
    }
    public Optional<Persona> registrarPersona(Persona persona) {
        Optional<Persona> optionalPersona = buscarPersona(persona.getNumeroIde());
        if (optionalPersona.isPresent()) {
            System.out.println("La Mascota ya existe en el sistema");
        } else {
            listaPersonas.add(persona);
            System.out.println("Persona registrarda");
        }
        return optionalPersona;
    }
    public Optional<Persona> editarPersona(String nombre, String apellido, String telefono, String direccion, String numeroIde) {
        Optional<Persona> optionalPersona = buscarPersona(numeroIde);
        if (optionalPersona.isPresent()) {
            Persona persona = optionalPersona.get();
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setTelefono(telefono);
            persona.setDireccion(direccion);
            System.out.println("Persona editada");
        } else {
            System.out.println("La Persona no existe en el sistema");
        }
        return optionalPersona;
    }
    public Optional<Persona> eliminarPersona(String numeroIde) {
        Optional<Persona> optionalPersona = buscarPersona(numeroIde);
        if (optionalPersona.isPresent()) {
            listaMascotas.remove(optionalPersona.get());
            System.out.println("Mascota eliminado");
        } else {
            System.out.println("La Mascota no existe en el sistema");
        }
        return optionalPersona;
    }


    //Crud Citas
    public Optional<Cita> buscarCita(String Idcita) {
        Optional<Cita> citaOptional = listaCitas.stream().filter(c -> c.getIdCita().equals(Idcita)).findFirst();
        return citaOptional;
    }
    public Optional<Cita> registrarCita(Cita cita) {
        Optional<Cita> citaOptional = buscarCita(cita.getIdCita());
        if (citaOptional.isPresent()) {
            //System.out.println("la cita con el numero de id" + cita.getIdCita() + " ya existe en el sistema asignada a la fecha y hora" + cita.getFecha() + cita.getHora());
        }else{
            listaCitas.add(cita);
        }
        return citaOptional;
    }
    public Optional<Cita> editarCita(String idCita, LocalDate fecha, LocalTime hora, String lugar, String descripcion) {
        Optional<Cita> citaOptional = buscarCita(idCita);
        if (citaOptional.isPresent()) {
            Cita cita = citaOptional.get();
            cita.setFecha(fecha);
            cita.setHora(hora);
            cita.setLugar(lugar);
            cita.setDescripcion(descripcion);
        }
        return citaOptional;
    }
    public Optional<Cita> eliminarCita(String idCita) {
        Optional<Cita> citaOptional = buscarCita(idCita);
        if (citaOptional.isPresent()) {
            listaCitas.remove(citaOptional.get());
        }
        return citaOptional;
    }


    public List<Cita> obtenerCitasDia(LocalDate fecha) {
        return listaCitas.stream()
                .filter(cita -> cita.getFecha().isEqual(fecha))
                .toList();
    }




    //Metodos para consultas
    public Optional<Consulta> registrarConsulta(String númerodeIde, Consulta consulta) {
        Optional<Mascota> mascotaOpt = buscarMascota(númerodeIde);
        mascotaOpt.ifPresent(mascota -> mascota.getHistorial().agregarConsulta(consulta));
        return mascotaOpt.map(mascota -> consulta);
    }

    public Optional<List<Consulta>> obtenerHistorialMascota(String numeroIde) {
        return buscarMascota(numeroIde)
                .map(mascota -> mascota.getHistorial().getConsultas());
    }



}

