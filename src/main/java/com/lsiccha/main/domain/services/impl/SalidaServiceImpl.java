package com.lsiccha.main.domain.services.impl;

import com.lsiccha.main.domain.model.Salida;
import com.lsiccha.main.domain.repositories.SalidaRepository;
import com.lsiccha.main.domain.services.SalidaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SalidaServiceImpl implements SalidaService {

    private final SalidaRepository salidaRepository;

    SalidaServiceImpl(SalidaRepository salidaRepository){
        this.salidaRepository = salidaRepository;
    }
    @Override
    public Salida save(Salida salida) {
        return this.salidaRepository.create(salida);
    }

    @Override
    public Salida getById(Integer id) {
        return this.salidaRepository.getById(id);
    }

    @Override
    public List<Salida> getAll() {
        return this.salidaRepository.getAll();
    }

    @Override
    public Salida update(Salida salida) {
        return this.salidaRepository.update(salida);
    }

    @Override
    public void delete(Integer id) {
        this.salidaRepository.deleteById(id);
    }
}
