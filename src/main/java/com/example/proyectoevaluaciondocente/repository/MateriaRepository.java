package com.example.proyectoevaluaciondocente.repository;

import com.example.proyectoevaluaciondocente.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {
}