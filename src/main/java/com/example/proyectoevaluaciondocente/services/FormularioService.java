package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Formulario;

import java.util.List;

public interface FormularioService {

    public Formulario create(Formulario c);
    public Formulario save(Formulario carrera);
    public Formulario findById(Integer id);
    public List<Formulario> findByAll();
    public void eliminar(Integer id);

}


