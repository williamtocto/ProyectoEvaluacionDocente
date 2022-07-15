package com.example.proyectoevaluaciondocente.repository;

import com.example.proyectoevaluaciondocente.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}