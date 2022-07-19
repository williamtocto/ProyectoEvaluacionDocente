package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Rol;

import com.example.proyectoevaluaciondocente.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepository repository;

    @Override
    public Rol create(Rol c) {
        return repository.save(c) ;
    }


    @Override
    public Rol save(Rol carrera) {
        return repository.save(carrera);
    }

    @Override
    public Rol findById(Integer id) {
        return repository.findById(id).orElse(new Rol());
    }

    @Override
    public List<Rol> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
    
}
