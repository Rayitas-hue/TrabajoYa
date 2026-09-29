package com.proyecto.trabajoya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.trabajoya.models.Usuario;
import com.proyecto.trabajoya.repository.ContratoRepository;

@Controller 
@RequestMapping ("/contratos")
public class ContratoController {
    private final ContratoRepository contratoRepository;

    public ContratoController(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }

     @GetMapping 
    public String verContratos(Model model) {
        model.addAttribute("contratos", new Usuario());
        return "contratos";
    }

}
