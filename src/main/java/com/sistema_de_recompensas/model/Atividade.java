package com.sistema_de_recompensas.model;


import jakarta.persistence.*;


@Entity
@Table(name = "atividade")
public class Atividade {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private double credito;
    private double debito;

    
    public Atividade(String nome, double credito, double debito) {
        this.nome = nome;
        this.credito = credito;
        this.debito = debito;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getDebito() {
        return debito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }
    
}
