package com.clase.clase.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AlumnoController {
    @GetMapping("/api/v1/alumnos")
    public String getAlumnos() {
        return "LISTADO DE ALUMNOS";
    }
    
}
