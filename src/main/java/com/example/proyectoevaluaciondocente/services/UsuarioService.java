package com.example.proyectoevaluaciondocente.services;



import com.example.proyectoevaluaciondocente.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario create(Usuario c);
    public Usuario save(Usuario carrera);
    public Usuario findById(Integer id);
    public List<Usuario> findByAll();
    public void eliminar(Integer id);


}
