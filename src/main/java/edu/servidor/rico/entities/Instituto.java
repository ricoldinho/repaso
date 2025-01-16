package edu.servidor.rico.entities;

import java.util.LinkedList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="institutos")
public class Instituto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre", nullable=false, length=150)
    private String nombre;
    @Column(name="localidad", nullable=false, length=55)
    private String localidad;
    @Column(name="capacidadAlumnos", nullable=false, length = 4)
    private int capacidadAlumnos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="instituto")
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
