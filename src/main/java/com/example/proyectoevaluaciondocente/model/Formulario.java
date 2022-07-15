package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "formulario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formulario", nullable = false)
    private Integer id;

    @Column(name = "preguntas", length = 150)
    private String preguntas;

    @Column(name = "observacion", length = 45)
    private String observacion;

    @OneToMany(mappedBy = "idFormulario")
    private Set<Evaluacion> evaluacions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idFormulario")
    private Set<FormularioTipoformulario> formularioTipoformularios = new LinkedHashSet<>();


}