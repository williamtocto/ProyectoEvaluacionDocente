package com.example.proyectoevaluaciondocente.repository;

import com.example.proyectoevaluaciondocente.model.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {
}