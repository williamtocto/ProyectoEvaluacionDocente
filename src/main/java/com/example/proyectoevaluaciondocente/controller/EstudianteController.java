package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.services.EstudianteService;
import com.example.proyectoevaluaciondocente.services.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    @Autowired
    EstudianteServiceImpl listaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>>listar() {
        List<Estudiante> lista=listaService.findByAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante u) {
        return new ResponseEntity<>(listaService.create(u), HttpStatus.CREATED);
    }


    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Estudiante> eliminarEstudiante(@PathVariable Integer id) {
        listaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


   @PutMapping("/actualizar/{id}")
    public ResponseEntity<Estudiante> actualizarEstudiante(@PathVariable Integer id, @RequestBody Estudiante c) {

       Estudiante listaActual=listaService.findById(id);

           listaActual.setNombre(c.getNombre());
           listaActual.setApellido(c.getApellido());
           listaActual.setCedula(c.getCedula());
            listaService.save(listaActual);

       return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }

}



