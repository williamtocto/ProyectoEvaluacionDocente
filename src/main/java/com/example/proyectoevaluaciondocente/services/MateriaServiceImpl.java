package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Materia;
import com.example.proyectoevaluaciondocente.repository.FormularioRepository;
import com.example.proyectoevaluaciondocente.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    MateriaRepository repository;

    @Override
    public Materia create(Materia c) {
        return repository.save(c) ;
    }


    @Override
    public Materia save(Materia carrera) {
        return repository.save(carrera);
    }

    @Override
    public Materia findById(Integer id) {
        return repository.findById(id).orElse(new Materia());
    }

    @Override
    public List<Materia> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
    
}
