package com.prova.Prova.service;

import com.prova.Prova.entity.Estudante;
import com.prova.Prova.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Servico {

    @Autowired
    private Repository Repository;

    public List<Estudante> lista(){
        return Repository.findAll();
    }

    public Optional<Estudante> entidade(Long id){
        return Repository.findById(id);
    }

    public Estudante save(Estudante entidade){
        return Repository.save(entidade);
    }

    public void delete(Long id){
        Repository.deleteById(id);

    }
}
