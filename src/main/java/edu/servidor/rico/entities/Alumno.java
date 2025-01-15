package edu.servidor.rico.entities;

public class Alumno {
    
    private String nombre;
    private int edad;
    private String modulo;
    private Dni dni;
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
