package com.sistema_de_recompensas.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sistema_de_recompensas.model.Atividade;

@Repository
public interface AtividadeRepository extends CrudRepository<Atividade,Long> {
    
}



