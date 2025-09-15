package com.prova.Prova.repository;

import com.prova.Prova.entity.Estudante;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Estudante,Long> {
}
