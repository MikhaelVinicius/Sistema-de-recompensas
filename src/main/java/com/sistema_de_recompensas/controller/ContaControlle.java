package com.sistema_de_recompensas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sistema_de_recompensas.model.Conta;
import com.sistema_de_recompensas.model.User;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaControlle {

    @Autowired
    private ContaRepository contaRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Conta> getContaById(@PathVariable Long id){
        Conta conta = contaRepository.findById(id).orElse(null);
        if(conta == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(conta);
        }
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Conta>> getAllContas(){
        List<Conta> contas = (List<Conta>) contaRepository.findAll();
        return ResponseEntity.ok(contas);
    }


    @PostMapping
    public ResponseEntity<Conta> createConta(@RequestBody Conta conta){
        Conta savedConta = contaRepository.save(conta);
        return ResponseEntity.ok(savedConta);
    }
}