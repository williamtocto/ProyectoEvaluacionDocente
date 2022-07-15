package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.repository.CicloRepository;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    EstudianteRepository repository;

    @Override
    public Estudiante create(Estudiante c) {
        return repository.save(c) ;
    }

    @Override
    public Estudiante save(Estudiante carrera) {
        return repository.save(carrera);
    }

    @Override
    public Estudiante findById(Integer id) {
        return repository.findById(id).orElse(new Estudiante());
    }

    @Override
    public List<Estudiante> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
}
