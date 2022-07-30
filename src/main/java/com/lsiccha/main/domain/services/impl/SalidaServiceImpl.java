package com.lsiccha.main.domain.services.impl;

import com.lsiccha.main.application.controllers.dto.SalidaDTO;
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
    public Salida save(SalidaDTO salida) {
        Salida salidaToSave = new Salida();

        salidaToSave.setId(salida.getId());
        salidaToSave.setFechaSalida(salida.getFechaSalida());
        salidaToSave.setHoraSalida(salida.getHoraSalida());
        salidaToSave.setPlacaVehiculo(salida.getPlacaVehiculo());
        salidaToSave.setChofer(salida.getChofer());

        return this.salidaRepository.create(salidaToSave);
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
    public Salida update(SalidaDTO salida) {
        Salida salidaToUpdate = new Salida();
        
        salidaToUpdate.setId(salida.getId());
        salidaToUpdate.setFechaSalida(salida.getFechaSalida());
        salidaToUpdate.setHoraSalida(salida.getHoraSalida());
        salidaToUpdate.setPlacaVehiculo(salida.getPlacaVehiculo());
        salidaToUpdate.setChofer(salida.getChofer());
        
        return this.salidaRepository.update(salidaToUpdate);
    }

    @Override
    public void delete(Integer id) {
        this.salidaRepository.deleteById(id);
    }
}
