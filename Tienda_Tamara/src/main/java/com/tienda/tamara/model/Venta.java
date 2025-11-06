package com.tienda.tamara.model;

public class Venta {
    private String producto;
    private String cliente;
    private double monto;
    private String fecha;

    public Venta(String producto, String cliente, double monto, String fecha) {
        this.producto = producto;
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getProducto() { return producto; }
    public String getCliente() { return cliente; }
    public double getMonto() { return monto; }
    public String getFecha() { return fecha; }
}
