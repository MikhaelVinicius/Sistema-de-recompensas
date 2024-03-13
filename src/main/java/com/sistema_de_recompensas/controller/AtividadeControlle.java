package com.sistema_de_recompensas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sistema_de_recompensas.model.Atividade;

@RestController
@RequestMapping("/atividade")
public class AtividadeControlle {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Atividade> getAtividadeById(@PathVariable Long id){
        Atividade atividade = atividadeRepository.findById(id).orElse(null);
        if(atividade == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(atividade);
        }
    }

    @GetMapping("/todas")
    public ResponseEntity<List<Atividade>> getAllAtividades(){
        List<Atividade> atividades = (List<Atividade>) atividadeRepository.findAll();
        return ResponseEntity.ok(atividades);
    }

    @PostMapping
    public ResponseEntity<Atividade> createAtividade(@RequestBody Atividade atividade){
        Atividade savedAtividade = atividadeRepository.save(atividade);
        return ResponseEntity.ok(savedAtividade);
    }
}
