package com.sopatech.governancacorp.models.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(unique = true)
    private String nome;
    private String descricao;

    @ManyToOne
    private Departamento departamento;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Metrica> metricas;

    public Meta(){
        metricas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Metrica> getMetricas() {
        return metricas;
    }

    public void setMetricas(List<Metrica> metricas) {
        this.metricas = metricas;
    }
}
