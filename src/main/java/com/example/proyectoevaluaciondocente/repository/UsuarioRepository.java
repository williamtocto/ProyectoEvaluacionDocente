package com.example.proyectoevaluaciondocente.repository;

import com.example.proyectoevaluaciondocente.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}