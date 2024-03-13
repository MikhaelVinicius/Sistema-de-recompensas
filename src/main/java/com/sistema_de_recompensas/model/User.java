package com.sistema_de_recompensas.model;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String age;
    private String senha;
    private String email;
    




    
    public User( String name, String age, String senha, String email, String atividades) {
    
        this.name = name;
        this.age = age;
        this.senha = senha;
        this.email = email;
     
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

 
    
}
