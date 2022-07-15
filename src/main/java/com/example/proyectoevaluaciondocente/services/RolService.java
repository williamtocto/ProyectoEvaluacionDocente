package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Rol;

import java.util.List;

public interface RolService {

    public Rol create(Rol c);
    public Rol save(Rol carrera);
    public Rol findById(Integer id);
    public List<Rol> findByAll();
    public void eliminar(Integer id);

}
