package com.lsiccha.main.infrastructure.repositories.impl;

import com.lsiccha.main.domain.model.Salida;
import com.lsiccha.main.domain.repositories.SalidaRepository;
import com.lsiccha.main.infrastructure.repositories.SalidaJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class SalidaRepositoryImpl implements SalidaRepository {

    private final SalidaJpaRepository salidaJpaRepository;

    SalidaRepositoryImpl(SalidaJpaRepository salidaRepository){
        this.salidaJpaRepository = salidaRepository;
    }

    @Override
    public Salida create(Salida salida) {
        return this.salidaJpaRepository.save(salida);
    }

    @Override
    public Salida getById(Integer id) {
        return this.salidaJpaRepository.getReferenceById(id);
    }

    @Override
    public List<Salida> getAll() {
        return this.salidaJpaRepository.findAll();
    }

    @Override
    public Salida update(Salida salida) {
        return this.salidaJpaRepository.save(salida);
    }

    @Override
    public void deleteById(Integer id) {
        this.salidaJpaRepository.deleteById(id);
    }
}
