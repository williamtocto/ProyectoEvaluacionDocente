package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Persona;
import com.example.proyectoevaluaciondocente.repository.MateriaRepository;
import com.example.proyectoevaluaciondocente.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository repository;

    @Override
    public Persona create(Persona c) {
        return repository.save(c) ;
    }



    @Override
    public Persona save(Persona carrera) {
        return repository.save(carrera);
    }

    @Override
    public Persona findById(Integer id) {
        return repository.findById(id).orElse(new Persona());
    }

    @Override
    public List<Persona> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
    
}
