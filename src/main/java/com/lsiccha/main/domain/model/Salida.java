package com.lsiccha.main.domain.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "salida")
@Data
public class Salida {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha_salida")
    private LocalDate fechaSalida;

    @Column(name = "hora_salida")
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horaSalida;

    @Column(name = "placa_vehiculo")
    private String placaVehiculo;

    @Column(name = "chofer")
    private String chofer;
}
