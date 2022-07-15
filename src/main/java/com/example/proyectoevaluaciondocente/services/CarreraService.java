package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Carrera;

import java.util.List;

public interface CarreraService {

    public Carrera create(Carrera c);
    public Carrera save(Carrera carrera);
    public Carrera findById(Integer id);
    public List<Carrera> findByAll();
    public void eliminar(Integer id);

}
