package com.example.prueba.model;

import java.io.Serializable;

public class BoletoSorteoCanasta implements Serializable {
    private String nombre;
    private String apellido;
    private int ci;
    private int telefono;
    private int numero;
    private String fecha;

    public BoletoSorteoCanasta() {
    }

    @Override
    public String toString() {
        return "BoletoSorteoCanasta{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ci=" + ci +
                ", telefono=" + telefono +
                ", numero=" + numero +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    public BoletoSorteoCanasta(String nombre, String apellido, int ci, int telefono, int numero, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.telefono = telefono;
        this.numero = numero;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
