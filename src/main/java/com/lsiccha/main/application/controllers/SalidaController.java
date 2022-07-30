package com.lsiccha.main.application.controllers;

import com.lsiccha.main.domain.model.Salida;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface SalidaController {

    @RequestMapping(produces = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Salida> create(@RequestBody Salida salida);

    @RequestMapping(value="/{id}", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Salida> getById(@PathVariable("id") Integer id);

    @RequestMapping(produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<List<Salida>> getAll();

    @RequestMapping(produces = {"application/json"}, method = RequestMethod.PUT)
    ResponseEntity<Salida> update(@RequestBody Salida salida);

    @RequestMapping(value="/{id}", produces = {"application/json"}, method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@PathVariable("id") Integer id);
}
