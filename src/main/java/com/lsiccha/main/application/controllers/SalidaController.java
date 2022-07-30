package com.lsiccha.main.application.controllers;

import com.lsiccha.main.domain.model.Salida;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface SalidaController {

    @PostMapping
    ResponseEntity<Salida> create(@RequestBody Salida salida);

    @GetMapping(value = "/{id}")
    ResponseEntity<Salida> getById(@PathVariable("id") Integer id);

    @GetMapping()
    ResponseEntity<List<Salida>> getAll();

    @PutMapping
    ResponseEntity<Salida> update(@RequestBody Salida salida);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Integer id);
}
