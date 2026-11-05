package com.sopatech.governancacorp.controllers;

import com.sopatech.governancacorp.models.entities.Departamento;
import com.sopatech.governancacorp.models.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoRepository dRepository;

    @PostMapping
    public void create(@RequestBody Departamento d){
        this.dRepository.save(d);
    }

    @PutMapping
    public void update(@RequestBody Departamento d){
        this.dRepository.save(d);
    }

    @GetMapping("/{id}")
    public Departamento findById(@PathVariable int id){
        Optional<Departamento> departamento = this.dRepository.findById(id);

        if(departamento.isPresent()){
            return departamento.get();
        };
        return null;
    }

}
