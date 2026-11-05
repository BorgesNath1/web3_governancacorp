package com.sopatech.governancacorp.models.repositories;

import com.sopatech.governancacorp.models.entities.Meta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MetaRepository extends JpaRepository<Meta,Integer> {
    public Optional<Meta> findByName (String nome);
    public void DeleteByName(String nome);
}
