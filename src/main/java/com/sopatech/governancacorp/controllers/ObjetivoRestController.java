package com.sopatech.governancacorp.controllers;

import com.sopatech.governancacorp.models.entities.Objetivo;
import com.sopatech.governancacorp.models.repositories.ObjetivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Objetivo")
public class ObjetivoRestController {

    @Autowired
    private ObjetivoRepository oRepository;

    @PostMapping
    public void create(@RequestBody Objetivo objetivo){
        this.oRepository.save(objetivo);
    }

    @PutMapping
    public void update(@RequestBody Objetivo objetivo){
        this.oRepository.save(objetivo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.oRepository.deleteById(id);
    }

    @DeleteMapping("/{titulo}")
    public void deleteByName(@PathVariable String titulo){
        this.oRepository.deleteByTitulo(titulo);
    }

    @GetMapping
    public List<Objetivo> findAll(){
        return this.oRepository.findAll();
    }

    @GetMapping("/{id}")
    public Objetivo findById(@PathVariable int id){
        Optional<Objetivo> objetivo = this.oRepository.findById(id);

        if (objetivo.isPresent()){
            return objetivo.get();
        }
        return null;
    }

    @GetMapping("/{titulo}")
    public Objetivo findByName(@PathVariable String titulo){
        Optional<Objetivo> objetivo = this.oRepository.findByTitulo(titulo);

        if(objetivo.isPresent()){
            return objetivo.get();
        }
        return null;
    }

}
