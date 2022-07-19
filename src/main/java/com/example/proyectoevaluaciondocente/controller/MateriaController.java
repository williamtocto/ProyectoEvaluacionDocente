package com.example.proyectoevaluaciondocente.controller;
import com.example.proyectoevaluaciondocente.model.Materia;
import com.example.proyectoevaluaciondocente.services.MateriaService;
import com.example.proyectoevaluaciondocente.services.MateriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materia")
public class MateriaController {
    @Autowired
    MateriaServiceImpl materiaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Materia>> listar() {
        List<Materia> lista=materiaService.findByAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Materia> crearLista(@RequestBody Materia u) {

        return new ResponseEntity<>(materiaService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Materia> elimi(@PathVariable Integer id) {
        materiaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Materia> actualizarLista(@PathVariable Integer id, @RequestBody Materia c) {

        Materia listaActual=materiaService.findById(id);

        listaActual.setNombreMateria(c.getNombreMateria());
        materiaService.save(listaActual);

        return null;
    }
}
