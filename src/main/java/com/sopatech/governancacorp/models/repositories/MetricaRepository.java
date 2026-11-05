package com.sopatech.governancacorp.models.repositories;

import com.sopatech.governancacorp.models.entities.Metrica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricaRepository extends JpaRepository<Metrica,Integer> {
}
