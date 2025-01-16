package edu.servidor.rico.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre", nullable=false, length=150)
    private String nombre;
    @Column(name="edad", nullable=false, length = 3)
    private int edad;
    @Column(name="modulo", nullable=false, length=150)
    private String modulo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dni_id", nullable = false)
    private Dni dni;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="instituto_id", nullable = false)
    private Instituto instituto;

    public Alumno(){}

    public Alumno(String nombre, int edad, String modulo, Dni dni, Instituto instituto) {
        this.nombre = nombre;
        this.edad = edad;
        this.modulo = modulo;
        this.dni = dni;
        this.instituto = instituto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }



   


    //quitamos el instituto del toString para que no se produzca un bucle infinito
    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", modulo=" + modulo + ", dni=" + dni + " el nombre del instituto al que acude es: " + this.instituto.getNombre() +"]";
    }
    
    

}
