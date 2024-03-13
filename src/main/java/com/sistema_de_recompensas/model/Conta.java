package com.sistema_de_recompensas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private double saldo;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Conta(User user) {
        this.user = user;
        
    }
    

    
    public void addSaldo(Atividade atividade){
        this.saldo += atividade.getCredito();
         
    }

    public void subSaldo (Atividade atividade){
        this.saldo -= atividade.getDebito(); 
    }
    

    
}
