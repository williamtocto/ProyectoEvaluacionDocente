package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Carrera;
import com.example.proyectoevaluaciondocente.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServiceImpl implements CarreraService {

    @Autowired
    CarreraRepository repository;

    @Override
    public Carrera create(Carrera c) {
        return repository.save(c) ;
    }

    @Override
    public Carrera save(Carrera carrera) {
        return repository.save(carrera);
    }

    @Override
    public Carrera findById(Integer id) {
        return repository.findById(id).orElse(new Carrera());
    }

    @Override
    public List<Carrera> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
}
