package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Evaluacion;

import java.util.List;

public interface EvaluacionService {

    public Evaluacion create(Evaluacion c);
    public Evaluacion save(Evaluacion carrera);
    public Evaluacion findById(Integer id);
    public List<Evaluacion> findByAll();
    public void eliminar(Integer id);

}

