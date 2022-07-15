package com.example.proyectoevaluaciondocente.services;

import com.example.proyectoevaluaciondocente.model.Formulario;
import com.example.proyectoevaluaciondocente.repository.EvaluacionRepository;
import com.example.proyectoevaluaciondocente.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioServiceImpl implements FormularioService {

    @Autowired
    FormularioRepository repository;

    @Override
    public Formulario create(Formulario c) {
        return repository.save(c) ;
    }

    @Override
    public Formulario save(Formulario carrera) {
        return repository.save(carrera);
    }

    @Override
    public Formulario findById(Integer id) {
        return repository.findById(id).orElse(new Formulario());
    }

    @Override
    public List<Formulario> findByAll() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
    repository.deleteById(id);
    }
    
}
