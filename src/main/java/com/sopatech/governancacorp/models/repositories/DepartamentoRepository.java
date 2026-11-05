package com.sopatech.governancacorp.models.repositories;

import com.sopatech.governancacorp.models.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<Departamento,Integer> {

}
