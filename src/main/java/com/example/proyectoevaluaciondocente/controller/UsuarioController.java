package com.example.proyectoevaluaciondocente.controller;



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

    /*
    @PutMapping("/update/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario usuario) {
        Usuario usuario1 = usuarioService.findById(id);
        if (usuario1 == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            usuario1.setNombre(usuario.getNombre());
            usuario1.setApellido(usuario.getApellido());
            return new ResponseEntity<>(usuarioService.save(usuario1), HttpStatus.OK);
        }
    }*/


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        usuarioService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/search/{id}")
    public  ResponseEntity<Usuario> search(@PathVariable Integer id){
        return new ResponseEntity<>(usuarioService.findById(id), HttpStatus.OK);
    }
}
