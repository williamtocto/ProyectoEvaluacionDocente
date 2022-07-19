package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Carrera;
import com.example.proyectoevaluaciondocente.services.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrera")
public class CarreraController {

    @Autowired
    CarreraService listaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Carrera>>listar() {
        List<Carrera> lista=listaService.findByAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Carrera> crearLista(@RequestBody Carrera u) {
        return new ResponseEntity<>(listaService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Carrera> eliminarLista(@PathVariable Integer id) {
        listaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


   @PutMapping("/actualizar/{id}")
    public ResponseEntity<Carrera> actualizarLista(@PathVariable Integer id, @RequestBody Carrera c) {

       Carrera listaActual=listaService.findById(id);
            listaActual.setNombreCarrera(c.getNombreCarrera());
            listaActual.setDescripcion(c.getDescripcion());
            listaService.save(listaActual);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }

}



