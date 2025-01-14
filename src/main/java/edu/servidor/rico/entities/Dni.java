package edu.servidor.rico.entities;

import java.time.LocalDate;

public class Dni {

    private String numero;
    private char letra;
    private LocalDate fechaExpedicion;
    private LocalDate fechaValidez;

    public Dni(){}

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
