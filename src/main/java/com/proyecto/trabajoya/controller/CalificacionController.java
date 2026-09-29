package com.proyecto.trabajoya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.trabajoya.models.Calificacion;
import com.proyecto.trabajoya.repository.CalificacionRepository;

@Controller 
@RequestMapping ("/calificaciones")
public class CalificacionController {
    private final CalificacionRepository calificacionRepository;

    public CalificacionController(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

     @GetMapping 
    public String verCalificacion(Model model) {
        model.addAttribute("calificacion", new Calificacion());
        return "calificacion";
    }

}
