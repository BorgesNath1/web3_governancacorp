package com.sopatech.governancacorp.controllers;

import com.sopatech.governancacorp.models.entities.Indicador;
import com.sopatech.governancacorp.models.repositories.IndicadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Indicador")
public class IndicadorRestController {

    @Autowired
    private IndicadorRepository iRepository;

    @PostMapping
    public void create(@RequestBody Indicador indicador){
        this.iRepository.save(indicador);
    }

    @PutMapping
    public void update(@RequestBody Indicador indicador){
        this.iRepository.save(indicador);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.iRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Indicador findById(@PathVariable int id){
        Optional<Indicador> indicador = this.iRepository.findById(id);

        if(indicador.isPresent()){
            return indicador.get();
        }
        return null;
    }

    @GetMapping
    public List<Indicador> findALl(){
        return this.iRepository.findAll();
    }

}
