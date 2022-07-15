package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Usuario;
import com.example.proyectoevaluaciondocente.repository.RolRepository;
import com.example.proyectoevaluaciondocente.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public Usuario create(Usuario c) {
        return repository.save(c) ;
    }

    @Override
    public Usuario save(Usuario carrera) {
        return repository.save(carrera);
    }

    @Override
    public Usuario findById(Integer id) {
        return repository.findById(id).orElse(new Usuario());
    }

    @Override
    public List<Usuario> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
    
}
