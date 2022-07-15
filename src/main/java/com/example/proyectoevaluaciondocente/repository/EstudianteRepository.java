package com.example.proyectoevaluaciondocente.repository;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}