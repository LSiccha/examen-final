package com.lsiccha.main.domain.repositories;

import com.lsiccha.main.domain.model.Salida;

import java.util.List;

public interface SalidaRepository {
    Salida create(Salida salida);
    Salida getById(Integer id);
    List<Salida> getAll();
    Salida update(Salida salida);
    void deleteById(Integer id);
}
