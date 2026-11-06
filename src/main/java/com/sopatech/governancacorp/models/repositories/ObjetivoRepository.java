package com.sopatech.governancacorp.models.repositories;

import com.sopatech.governancacorp.models.entities.Objetivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ObjetivoRepository extends JpaRepository<Objetivo,Integer> {
    Optional<Objetivo> deleteByTitulo(String titulo);
    Optional<Objetivo> findByTitulo(String titulo);
}
