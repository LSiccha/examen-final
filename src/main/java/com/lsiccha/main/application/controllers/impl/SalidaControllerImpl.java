package com.lsiccha.main.application.controllers.impl;

import com.lsiccha.main.application.controllers.SalidaController;
import com.lsiccha.main.application.controllers.dto.SalidaDTO;
import com.lsiccha.main.domain.model.Salida;
import com.lsiccha.main.domain.services.SalidaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/salida")
@Slf4j
public class SalidaControllerImpl implements SalidaController {

    private final SalidaService salidaService;

    SalidaControllerImpl(SalidaService salidaService){
        this.salidaService = salidaService;
    }
    @Override
    public ResponseEntity<Salida> create(SalidaDTO salida) {
        Salida saved = this.salidaService.save(salida);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Salida> getById(Integer id) {
        Salida found = this.salidaService.getById(id);
        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Salida>> getAll() {
        List<Salida> fromDb = this.salidaService.getAll();
        return new ResponseEntity<>(fromDb, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Salida> update(SalidaDTO salida) {
        Salida updated = this.salidaService.update(salida);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        this.salidaService.delete(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
