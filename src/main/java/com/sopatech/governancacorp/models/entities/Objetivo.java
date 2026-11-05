package com.sopatech.governancacorp.models.entities;

import com.sopatech.governancacorp.models.enums.Prazo;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Objetivo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(unique = true)
    private String titulo;
    private Prazo duracao;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Meta> metas;

    public Objetivo() {
        metas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Prazo getDuracao() {
        return duracao;
    }

    public void setDuracao(Prazo duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }
}
