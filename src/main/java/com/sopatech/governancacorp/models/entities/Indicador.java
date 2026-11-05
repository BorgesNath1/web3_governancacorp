package com.sopatech.governancacorp.models.entities;

import com.sopatech.governancacorp.models.enums.Prazo;
import com.sopatech.governancacorp.models.enums.Semaforo;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Indicador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private Semaforo qualidade;
    private Prazo prazo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Metrica> metrica;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Semaforo getQualidade() {
        return qualidade;
    }

    public void setQualidade(Semaforo qualidade) {
        this.qualidade = qualidade;
    }

    public List<Metrica> getMetrica() {
        return metrica;
    }

    public void setMetrica(List<Metrica> metrica) {
        this.metrica = metrica;
    }

    public Prazo getPrazo() {
        return prazo;
    }

    public void setPrazo(Prazo prazo) {
        this.prazo = prazo;
    }
}
