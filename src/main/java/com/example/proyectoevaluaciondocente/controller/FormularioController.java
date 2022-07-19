package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Formulario;
import com.example.proyectoevaluaciondocente.services.FormularioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formulario")
public class FormularioController {

    @Autowired
    private FormularioServiceImpl formularioService;

    @PostMapping("/save")
    public ResponseEntity<Formulario> save(@RequestBody Formulario formulario) {
        return new ResponseEntity<>(formularioService.save(formulario), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Formulario>> read(){
        return new ResponseEntity<>(formularioService.findByAll(), HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        formularioService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/search/{id}")
    public  ResponseEntity<Formulario> search(@PathVariable Integer id){
        return new ResponseEntity<>(formularioService.findById(id), HttpStatus.OK);
    }

}
