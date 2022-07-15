package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "carrera")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_periodo_academico")
    private PeriodoAcademico idPeriodoAcademico;

    @Column(name = "nombre_carrera", length = 45)
    private String nombreCarrera;

    @Column(name = "descripcion", length = 45)
    private String descripcion;

    @OneToMany(mappedBy = "idCarrera")
    private Set<Evaluacion> evaluacions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCarrera")
    private Set<Ciclo> ciclos = new LinkedHashSet<>();

}