package com.lsiccha.main.domain.services;

import com.lsiccha.main.domain.model.Salida;

import java.util.List;

public interface SalidaService {
    Salida save(Salida salida);
    Salida getById(Integer id);
    List<Salida> getAll();
    Salida update(Salida salida);
    void delete(Integer id);
}
