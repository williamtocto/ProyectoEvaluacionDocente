package com.example.proyectoevaluaciondocente.controller;


import com.example.proyectoevaluaciondocente.model.Evaluacion;
import com.example.proyectoevaluaciondocente.model.Rol;
import com.example.proyectoevaluaciondocente.services.EvaluacionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluacion")
public class EvaluacionController {
    @Autowired
    private EvaluacionServiceImpl evaluacionService;

    @GetMapping("/list")
    public ResponseEntity<List<Evaluacion>> listar() {
        return new ResponseEntity<>(evaluacionService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Evaluacion> crear(@RequestBody Evaluacion c) {
        return new ResponseEntity<>(evaluacionService.save(c), HttpStatus.CREATED);

    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Evaluacion> actualizarLista(@PathVariable Integer id, @RequestBody Evaluacion c) {

        Evaluacion listaActual=evaluacionService.findById(id);
        listaActual.setCalificacion(c.getCalificacion());
        listaActual.setIdCiclo(c.getIdCiclo());
        listaActual.setIdMateria(c.getIdMateria());
        listaActual.setIdTipoFormulario(c.getIdTipoFormulario());
        listaActual.setFecha(c.getFecha());
        listaActual.setIdCarrera(c.getIdCarrera());
        listaActual.setObservacion(c.getObservacion());

        evaluacionService.save(listaActual);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Evaluacion> eliminar(@PathVariable Integer id) {
        evaluacionService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Evaluacion> buscar(@PathVariable Integer id) {
        return new ResponseEntity<>(evaluacionService.findById(id), HttpStatus.OK);
    }
}
