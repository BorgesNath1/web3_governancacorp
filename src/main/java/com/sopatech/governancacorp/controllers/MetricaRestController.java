package com.sopatech.governancacorp.controllers;

import com.sopatech.governancacorp.models.entities.Metrica;
import com.sopatech.governancacorp.models.repositories.MetricaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Metrica")
public class MetricaRestController {

    @Autowired
    private MetricaRepository mRepository;

    @PostMapping
    public void create(Metrica metrica){
        this.mRepository.save(metrica);
    }

    @PutMapping
    public void update(Metrica metrica){
        this.mRepository.save(metrica);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id){
        this.mRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Metrica findById(@PathVariable int id){
        Optional<Metrica> metrica = this.mRepository.findById(id);

        if(metrica.isPresent()){
            return metrica.get();
        }
        return null;
    }

    @GetMapping
    public List<Metrica> findAll(){
        return this.mRepository.findAll();
    }

    //analisar a inclusão do get metricas by meta


}
