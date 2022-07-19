package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "evaluacion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluacion", nullable = false)
    private Integer id;

    @Column(name = "calificacion")
    private Integer calificacion;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "observacion")
    private String observacion;


    @Column(name = "id_carrera")
    private int idCarrera;


    @Column(name = "id_ciclo")
    private int idCiclo;


    @Column(name = "id_formulario")
    private int idFormulario;


    @JoinColumn(name = "id_materia")
    private int idMateria;

    @Column(name = "id_persona")
    private int idPersona;


    @Column(name = "id_tipo_formulario")
    private int idTipoFormulario;


}