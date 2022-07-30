package com.lsiccha.main.application.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@Builder
@Data
public class SalidaDTO {
    private Integer id;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private String placaVehiculo;
    private String chofer;
}
