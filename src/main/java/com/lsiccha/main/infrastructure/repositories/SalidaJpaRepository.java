package com.lsiccha.main.infrastructure.repositories;

import com.lsiccha.main.domain.model.Salida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalidaJpaRepository extends JpaRepository<Salida, Integer> {

}
