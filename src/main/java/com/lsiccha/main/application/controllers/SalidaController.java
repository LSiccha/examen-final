package com.lsiccha.main.application.controllers;

import com.lsiccha.main.application.controllers.dto.SalidaDTO;
import com.lsiccha.main.domain.model.Salida;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface SalidaController {

    @PostMapping(produces = {"application/json"})
    ResponseEntity<Salida> create(@RequestBody SalidaDTO salida);

    @GetMapping(value="/{id}", produces = {"application/json"})
    ResponseEntity<Salida> getById(@PathVariable("id") Integer id);

    @GetMapping(produces = {"application/json"})
    ResponseEntity<List<Salida>> getAll();

    @PutMapping(produces = {"application/json"})
    ResponseEntity<Salida> update(@RequestBody SalidaDTO salida);

    @DeleteMapping(value="/{id}", produces = {"application/json"})
    ResponseEntity<Void> delete(@PathVariable("id") Integer id);
}
