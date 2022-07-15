package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Evaluacion;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionServiceImpl implements EvaluacionService {

    @Autowired
    EvaluacionRepository repository;

    @Override
    public Evaluacion create(Evaluacion c) {
        return repository.save(c) ;
    }

    @Override
    public Evaluacion save(Evaluacion carrera) {
        return repository.save(carrera);
    }

    @Override
    public Evaluacion findById(Integer id) {
        return repository.findById(id).orElse(new Evaluacion());
    }

    @Override
    public List<Evaluacion> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
}
