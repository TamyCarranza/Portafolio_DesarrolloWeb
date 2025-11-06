package com.tienda.tamara.service;

import java.util.*;
import com.tienda.tamara.model.*;

import org.springframework.stereotype.Service;

@Service
public class DatosSimulados {

    private final List<Venta> ventas;
    private final List<Reparacion> reparaciones;
    private final List<Producto> productos;

    public DatosSimulados() {
        ventas = new ArrayList<>();
        reparaciones = new ArrayList<>();
        productos = new ArrayList<>();

        // Ventas simuladas
        ventas.add(new Venta("Laptop HP", "Carlos Méndez", 650000, "2025-10-12"));
        ventas.add(new Venta("Monitor Samsung 24''", "Ana López", 125000, "2025-09-30"));
        ventas.add(new Venta("Mouse Logitech", "Pedro Arias", 18000, "2025-10-05"));

        // Reparaciones simuladas
        reparaciones.add(new Reparacion("PC Escritorio", "Cambio de fuente", 35000, "Completado"));
        reparaciones.add(new Reparacion("Laptop Acer", "Limpieza de hardware", 25000, "En proceso"));
        reparaciones.add(new Reparacion("Monitor LG", "Reparación de backlight", 42000, "Pendiente"));

        // Productos simulados
        productos.add(new Producto("Laptop Dell Inspiron", "Laptops", 520000, 5));
        productos.add(new Producto("Laptop HP Pavilion", "Laptops", 680000, 3));
        productos.add(new Producto("Laptop Lenovo IdeaPad", "Laptops", 450000, 6));
        productos.add(new Producto("Impresora Epson L3250", "Impresoras", 120000, 4));
        productos.add(new Producto("Monitor LG 27''", "Monitores", 180000, 7));
        productos.add(new Producto("Monitor Samsung 24''", "Monitores", 155000, 8));
    }

    // Métodos getter
    public List<Venta> getVentas() { return ventas; }
    public List<Reparacion> getReparaciones() { return reparaciones; }
    public List<Producto> getProductos() { return productos; }

    // Filtros
    public List<Venta> filtrarVentas(double min, double max) {
        List<Venta> resultado = new ArrayList<>();
        for (Venta v : ventas) {
            if (v.getMonto() >= min && v.getMonto() <= max) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public List<Reparacion> filtrarReparaciones(double min, double max) {
        List<Reparacion> resultado = new ArrayList<>();
        for (Reparacion r : reparaciones) {
            if (r.getCosto() >= min && r.getCosto() <= max) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    public List<Producto> filtrarProductos(double min, double max) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
