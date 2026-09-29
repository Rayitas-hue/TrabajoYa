package com.proyecto.trabajoya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.trabajoya.models.Usuario;
import com.proyecto.trabajoya.services.implement.UsuarioServiceImpl;

@Controller 
@RequestMapping ("/usuarios")
public class UsuarioController {
    private final UsuarioServiceImpl usuarioService;

    public UsuarioController(UsuarioServiceImpl usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping 
    public String verUsuarios(Model model) {
        model.addAttribute("usuarios", new Usuario());
        return "usuarios";
    }
}
