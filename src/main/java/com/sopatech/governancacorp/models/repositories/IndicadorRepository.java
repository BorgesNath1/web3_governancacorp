package com.sopatech.governancacorp.models.repositories;

import com.sopatech.governancacorp.models.entities.Indicador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndicadorRepository extends JpaRepository<Indicador,Integer> {
}
