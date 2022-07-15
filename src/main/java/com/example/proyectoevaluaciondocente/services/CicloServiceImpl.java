package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Ciclo;
import com.example.proyectoevaluaciondocente.repository.CarreraRepository;
import com.example.proyectoevaluaciondocente.repository.CicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloServiceImpl implements CicloService {

    @Autowired
    CicloRepository repository;

    @Override
    public Ciclo create(Ciclo c) {
        return repository.save(c) ;
    }

    @Override
    public Ciclo save(Ciclo carrera) {
        return repository.save(carrera);
    }

    @Override
    public Ciclo findById(Integer id) {
        return repository.findById(id).orElse(new Ciclo());
    }

    @Override
    public List<Ciclo> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
}
