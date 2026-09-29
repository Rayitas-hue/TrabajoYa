package com.proyecto.trabajoya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.trabajoya.models.CategoriaServicio;
import com.proyecto.trabajoya.repository.CategoriaServicioRepository;

@Controller 
@RequestMapping ("/categorias")
public class CategoriaServicioController {
    private final CategoriaServicioRepository categoriaServicioRepository;

    public CategoriaServicioController(CategoriaServicioRepository categoriaServicioRepository) {
        this.categoriaServicioRepository = categoriaServicioRepository;
    }

     @GetMapping 
    public String verCategorias(Model model) {
        model.addAttribute("categorias", new CategoriaServicio());
        return "categorias";
    }

}
