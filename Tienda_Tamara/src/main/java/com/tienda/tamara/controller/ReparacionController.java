package com.tienda.tamara.controller;

import com.tienda.tamara.service.DatosSimulados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReparacionController {

    private final DatosSimulados datos;

    public ReparacionController(DatosSimulados datos) {
        this.datos = datos;
    }

    @GetMapping("/reparaciones")
    public String listarReparaciones(Model model) {
        model.addAttribute("reparaciones", datos.getReparaciones());
        return "reparaciones";
    }
}
