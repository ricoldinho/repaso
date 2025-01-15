package edu.servidor.rico.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="dnis")
public class Dni {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="numero", nullable=false, length=8)
    private String numero;
    @Column(name="letra", nullable=false, length=1)
    private char letra;
    @Column(name="fechaExpedicion", nullable=false)
    private LocalDate fechaExpedicion;
    @Column(name="fechaValidez", nullable=false)
    private LocalDate fechaValidez;

    public Dni(){}

    

    public Dni(String numero, char letra, LocalDate fechaExpedicion, LocalDate fechaValidez) {
        this.numero = numero;
        this.letra = letra;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaValidez = fechaValidez;
    }



    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(LocalDate fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    @Override
    public String toString() {
        return "Dni [numero=" + numero + ", letra=" + letra + ", fechaExpedicion=" + fechaExpedicion + ", fechaValidez="
                + fechaValidez + "]";
    }

    

}
