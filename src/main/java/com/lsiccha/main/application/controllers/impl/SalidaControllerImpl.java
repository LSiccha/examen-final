package com.lsiccha.main.application.controllers.impl;

import com.lsiccha.main.application.controllers.SalidaController;
import com.lsiccha.main.domain.model.Salida;
import com.lsiccha.main.domain.services.SalidaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class SalidaControllerImpl implements SalidaController {

    private final SalidaService salidaService;

    SalidaControllerImpl(SalidaService salidaService){
        this.salidaService = salidaService;
    }
    @Override
    public ResponseEntity<Salida> create(Salida salida) {
        Salida saved = this.salidaService.save(salida);
        ResponseEntity<Salida> response = new ResponseEntity<>(saved, HttpStatus.CREATED);
        return response;
    }

    @Override
    public ResponseEntity<Salida> getById(Integer id) {
        Salida found = this.salidaService.getById(id);
        ResponseEntity<Salida> response = new ResponseEntity<>(found, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<List<Salida>> getAll() {
        List<Salida> fromDb = this.salidaService.getAll();
        ResponseEntity<List<Salida>> response = new ResponseEntity<>(fromDb, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<Salida> update(Salida salida) {
        Salida updated = this.salidaService.update(salida);
        ResponseEntity<Salida> response = new ResponseEntity<>(updated, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        this.salidaService.delete(id);
        ResponseEntity<Void> response = new ResponseEntity<>(HttpStatus.CREATED);
        return response;
    }
}
