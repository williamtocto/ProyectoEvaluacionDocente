package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer id;

   // @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "id_persona")
    private int idPersona;

   // @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "contrasenia")
    private String contrasenia;

    @Column(name = "fecha_hora_registro")
    private String fechaHoraRegistro;
}