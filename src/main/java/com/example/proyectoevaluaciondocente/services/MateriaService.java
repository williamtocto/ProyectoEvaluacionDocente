package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Materia;

import java.util.List;

public interface MateriaService {

    public Materia create(Materia c);
    public Materia save(Materia carrera);
    public Materia findById(Integer id);
    public List<Materia> findByAll();
    public void eliminar(Integer id);

}
