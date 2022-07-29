package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Ciclo;
import com.example.proyectoevaluaciondocente.services.CicloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciclo")
public class CicloController {

    @Autowired
    CicloServiceImpl cicloService;

    @GetMapping("/listar")
    public ResponseEntity<List<Ciclo>>listar() {
        List<Ciclo> lista= cicloService.findByAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Ciclo> crearCiclo(@RequestBody Ciclo u) {
        return new ResponseEntity<>(cicloService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Ciclo> eliminarCiclo(@PathVariable Integer id) {
        cicloService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

   @PutMapping("/actualizar/{id}")
    public ResponseEntity<Ciclo> actualizarCiclo(@PathVariable Integer id, @RequestBody Ciclo c) {
        Ciclo listaActual= cicloService.findById(id);
       listaActual.setIdCarrera(c.getIdCarrera());
       listaActual.setCiclo(c.getCiclo());
       listaActual.setObservaciones(c.getObservaciones());
       cicloService.save(listaActual);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}



