package com.tienda.tamara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tienda.tamara.service.DatosSimulados;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

    private final DatosSimulados datos;

    public ConsultaController(DatosSimulados datos) {
        this.datos = datos;
    }

    @GetMapping("/listado")
    public String mostrarConsultas(Model model) {
        model.addAttribute("ventas", datos.getVentas());
        model.addAttribute("reparaciones", datos.getReparaciones());
        model.addAttribute("productos", datos.getProductos());
        return "consulta/listado";
    }

    @PostMapping("/filtrar")
    public String filtrar(
            @RequestParam double minimo,
            @RequestParam double maximo,
            @RequestParam String tipo,
            Model model) {

        if (tipo.equals("venta")) {
            model.addAttribute("ventas", datos.filtrarVentas(minimo, maximo));
            model.addAttribute("reparaciones", datos.getReparaciones());
            model.addAttribute("productos", datos.getProductos());
        } else if (tipo.equals("reparacion")) {
            model.addAttribute("reparaciones", datos.filtrarReparaciones(minimo, maximo));
            model.addAttribute("ventas", datos.getVentas());
            model.addAttribute("productos", datos.getProductos());
        } else if (tipo.equals("producto")) {
            model.addAttribute("productos", datos.filtrarProductos(minimo, maximo));
            model.addAttribute("ventas", datos.getVentas());
            model.addAttribute("reparaciones", datos.getReparaciones());
        }

        return "consulta/listado";
    }
}
