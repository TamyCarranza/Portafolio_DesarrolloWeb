package com.tienda.tamara.model;

public class Reparacion {
    private String equipo;
    private String descripcion;
    private double costo;
    private String estado;

    public Reparacion(String equipo, String descripcion, double costo, String estado) {
        this.equipo = equipo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }

    public String getEquipo() { return equipo; }
    public String getDescripcion() { return descripcion; }
    public double getCosto() { return costo; }
    public String getEstado() { return estado; }
}
