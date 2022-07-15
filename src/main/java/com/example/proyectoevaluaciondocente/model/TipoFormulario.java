package com.example.proyectoevaluaciondocente.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tipo_formulario")
public class TipoFormulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo_formulario", nullable = false)
    private Integer id;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "porcentaje")
    private Integer porcentaje;

    @Column(name = "tipo_formulario")
    private String tipoFormulario;

    @OneToMany(mappedBy = "idTipoFormulario")
    private Set<Evaluacion> evaluacions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idtipoFormulario")
    private Set<FormularioTipoformulario> formularioTipoformularios = new LinkedHashSet<>();

}