package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Rol;
import com.example.proyectoevaluaciondocente.services.RolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    private RolServiceImpl rolService;

    @PostMapping("/save")
    public ResponseEntity<Rol> save(@RequestBody Rol rol) {
        return new ResponseEntity<>(rolService.save(rol), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Rol>> read(){
        return new ResponseEntity<>(rolService.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        rolService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/search/{id}")
    public  ResponseEntity<Rol> search(@PathVariable Integer id){
        return new ResponseEntity<>(rolService.findById(id), HttpStatus.OK);
    }

}
