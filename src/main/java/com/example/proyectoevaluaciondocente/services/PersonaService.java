package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Persona;

import java.util.List;

public interface PersonaService {

    public Persona create(Persona c);
    public Persona save(Persona carrera);
    public Persona findById(Integer id);
    public List<Persona> findByAll();
    public void eliminar(Integer id);

}
