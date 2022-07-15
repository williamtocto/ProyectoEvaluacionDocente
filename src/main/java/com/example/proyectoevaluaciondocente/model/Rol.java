package com.example.proyectoevaluaciondocente.model;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private Integer id;

    @Column(name = "rol")
    private String rol;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_hora_registro")
    private Instant fechaHoraRegistro;

    @OneToMany(mappedBy = "idRol")
    private Set<Usuario> usuarios = new LinkedHashSet<>();


}