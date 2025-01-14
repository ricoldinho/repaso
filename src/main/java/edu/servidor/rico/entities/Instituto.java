package edu.servidor.rico.entities;

import java.util.LinkedList;

public class Instituto {
    private String nombre;
    private String localidad;
    private int capacidadAlumnos;
    private LinkedList<Alumno> alumnos;


    public Instituto(){}


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getLocalidad() {
        return localidad;
    }


    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }


    public int getCapacidadAlumnos() {
        return capacidadAlumnos;
    }


    public void setCapacidadAlumnos(int capacidadAlumnos) {
        this.capacidadAlumnos = capacidadAlumnos;
    }


    public LinkedList<Alumno> getAlumnos() {
        return alumnos;
    }


    public void setAlumnos(LinkedList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    @Override
    public String toString() {
        return "Instituto [nombre=" + nombre + ", localidad=" + localidad + ", capacidadAlumnos=" + capacidadAlumnos
                + ", alumnos=" + alumnos + "]";
    }

    
    

}
