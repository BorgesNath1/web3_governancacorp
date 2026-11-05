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
    public void create(Objetivo objetivo){
        this.oRepository.save(objetivo);
    }

    @PutMapping
    public void update(Objetivo objetivo){
        this.oRepository.save(objetivo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.oRepository.deleteById(id);
    }

    @DeleteMapping("/{nome}")
    public void deleteByName(@PathVariable String nome){
        this.oRepository.deleteByName(nome);
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

    @GetMapping("/{nome}")
    public Objetivo findByName(@PathVariable String nome){
        Optional<Objetivo> objetivo = this.oRepository.findByName(nome);

        if(objetivo.isPresent()){
            return objetivo.get();
        }
        return null;
    }

}
