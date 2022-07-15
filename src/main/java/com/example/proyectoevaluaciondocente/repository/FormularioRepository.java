package com.example.proyectoevaluaciondocente.repository;

import com.example.proyectoevaluaciondocente.model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormularioRepository extends JpaRepository<Formulario, Integer> {
}