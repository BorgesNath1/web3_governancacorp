package com.sopatech.governancacorp.controllers;

import com.sopatech.governancacorp.models.entities.Meta;
import com.sopatech.governancacorp.models.repositories.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Meta")
public class MetaRestController {

    @Autowired
    private MetaRepository mRepository;

    @PostMapping
    public void create(@RequestBody Meta meta){
        this.mRepository.save(meta);
    }

    @PutMapping
    public void update(@RequestBody Meta meta){
        this.mRepository.save(meta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.mRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Meta findById(@PathVariable int id){
        Optional<Meta> meta = this.mRepository.findById(id);

        if(meta.isPresent()){
            return meta.get();
        }
        return null;
    }

    @GetMapping
    public List<Meta> FindALlMeta(){
        return this.mRepository.findAll();
    }

    @GetMapping("/{nome}")
    public Meta findByNome(@PathVariable String nome){
        Optional<Meta> meta = this.mRepository.findByNome(nome);

        if (meta.isPresent()){
            return meta.get();
        }
        return null;
    }

    @DeleteMapping("/{nome}")
    public void deleteByName(@PathVariable String nome){
        this.mRepository.deleteByNome(nome);
    }

}
