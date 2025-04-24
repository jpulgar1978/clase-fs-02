package com.clase.clase.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1")
public class AlumnoController {
    @GetMapping("/alumnos")
    public String getAlumnos() {
        return "LISTADO DE ALUMNOS";
    }

    @GetMapping("/hello/{nombre}")
    public String getSaludo(@PathVariable("nombre") String nombreSaludo) {
        return "Hola a todos, mi nombre es " + nombreSaludo;
    }

    @GetMapping("suma/{n1}/{n2}")
    public String sumar(@PathVariable("n1") int numero1, @PathVariable("n2") int numero2 ) {
        return "El resultado es: " + (numero1 + numero2);
    }
    
    
}
