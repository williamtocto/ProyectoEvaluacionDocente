package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ciclo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ciclo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciclo", nullable = false)
    private Integer id;

    @Column(name = "ciclo", length = 45)
    private String ciclo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrera")
    private Carrera idCarrera;

    @Column(name = "observaciones", length = 45)
    private String observaciones;

    @OneToMany(mappedBy = "idCiclo")
    private Set<Evaluacion> evaluacions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCiclo")
    private Set<Materia> materias = new LinkedHashSet<>();


}