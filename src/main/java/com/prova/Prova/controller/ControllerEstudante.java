package com.prova.Prova.controller;


import com.prova.Prova.entity.Estudante;
import com.prova.Prova.service.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Estudantes")
public class ControllerEstudante {

    @Autowired
    private Servico service;

    @PostMapping
    public Estudante criar(@RequestBody Estudante entidade){
        return service.save(entidade);
    }

    @GetMapping
    public List<Estudante> listar(){
        return service.lista();
    }

    @GetMapping("/{id}")
    public Estudante buscar(@PathVariable Long id) {
        return service.entidade(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Estudante atualizar(@PathVariable Long id, @RequestBody Estudante entidade) {
        entidade.setId(id);
        return service.save(entidade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }



}
