package com.proyecto.trabajoya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyecto.trabajoya.models.Servicio;
import com.proyecto.trabajoya.repository.ServicioRepository;

@Controller 
@RequestMapping ("/servicios")
public class ServicioController {
    private final ServicioRepository servicioRepository;

    public ServicioController(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }
    
    @GetMapping 
    public String verServicios(Model model) {
        model.addAttribute("servicios", new Servicio());
        return "servicios";
    }

}
