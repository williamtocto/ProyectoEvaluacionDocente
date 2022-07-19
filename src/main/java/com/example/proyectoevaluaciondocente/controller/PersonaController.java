package com.example.proyectoevaluaciondocente.controller;


import com.example.proyectoevaluaciondocente.model.Persona;
import com.example.proyectoevaluaciondocente.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
  private PersonaServiceImpl personaService;

    @PostMapping("/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Persona>> read(){
        return new ResponseEntity<>(personaService.findByAll(), HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        personaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/search/{id}")
    public  ResponseEntity<Persona> search(@PathVariable Integer id){
        return new ResponseEntity<>(personaService.findById(id), HttpStatus.OK);
    }


}
