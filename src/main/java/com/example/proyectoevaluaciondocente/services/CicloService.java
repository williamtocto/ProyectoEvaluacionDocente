package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Ciclo;

import java.util.List;

public interface CicloService {

    public Ciclo create(Ciclo c);
    public Ciclo save(Ciclo carrera);
    public Ciclo findById(Integer id);
    public List<Ciclo> findByAll();
    public void eliminar(Integer id);

}

