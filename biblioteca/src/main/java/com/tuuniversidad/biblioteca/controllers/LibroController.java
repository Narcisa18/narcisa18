package com.tuuniversidad.biblioteca.controllers;

import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.getAllLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibroById(@PathVariable("id") Long id) {
        return libroService.getLibroById(id);
    }

    @PostMapping
    public void addLibro(@RequestBody Libro libro) {
        libroService.addLibro(libro);
    }
}
