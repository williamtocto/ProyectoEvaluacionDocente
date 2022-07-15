package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Estudiante;

import java.util.List;

public interface EstudianteService {

    public Estudiante create(Estudiante c);
    public Estudiante save(Estudiante carrera);
    public Estudiante findById(Integer id);
    public List<Estudiante> findByAll();
    public void eliminar(Integer id);

}

