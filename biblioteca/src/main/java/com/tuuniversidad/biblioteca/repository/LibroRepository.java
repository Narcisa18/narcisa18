package com.tuuniversidad.biblioteca.repository;

import com.tuuniversidad.biblioteca.models.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository() {
        libros.add(new Libro(1L, "Cien Años de Soledad", "Gabriel Garcia Marquez", "Sudamericana", 1967));
        libros.add(new Libro(2L, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 1605));
        // Agrega más libros si es necesario
    }

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}
