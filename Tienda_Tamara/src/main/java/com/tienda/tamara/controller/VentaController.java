package com.tienda.tamara.controller;

import com.tienda.tamara.service.DatosSimulados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VentaController {

    private final DatosSimulados datos;

    public VentaController(DatosSimulados datos) {
        this.datos = datos;
    }

    @GetMapping("/ventas")
    public String listarVentas(Model model) {
        model.addAttribute("ventas", datos.getVentas());
        return "ventas";
    }
}
