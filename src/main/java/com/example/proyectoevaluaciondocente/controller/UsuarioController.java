package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Rol;
import com.example.proyectoevaluaciondocente.model.Usuario;
import com.example.proyectoevaluaciondocente.services.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @PostMapping("/save")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Usuario>> read(){
        return new ResponseEntity<>(usuarioService.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        usuarioService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/search/{id}")
    public  ResponseEntity<Usuario> search(@PathVariable Integer id){
        return new ResponseEntity<>(usuarioService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Rol> actualizarLista(@PathVariable Integer id, @RequestBody Usuario c) {

        Usuario listaActual=usuarioService.findById(id);
        listaActual.setContrasenia(c.getContrasenia());
        listaActual.setUsuario(c.getUsuario());
        listaActual.setFechaHoraRegistro(c.getFechaHoraRegistro());
        listaActual.setIdPersona(c.getIdPersona());
        listaActual.setIdRol(c.getIdRol());
        usuarioService.save(listaActual);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
