package com.lsiccha.main.domain.services;

import com.lsiccha.main.application.controllers.dto.SalidaDTO;
import com.lsiccha.main.domain.model.Salida;

import java.util.List;

public interface SalidaService {
    Salida save(SalidaDTO salida);
    Salida getById(Integer id);
    List<Salida> getAll();
    Salida update(SalidaDTO salida);
    void delete(Integer id);
}
