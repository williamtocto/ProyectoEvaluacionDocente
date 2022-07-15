package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "materia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia", nullable = false)
    private Integer id;

    @Column(name = "nombre_Materia", length = 45)
    private String nombreMateria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ciclo")
    private Ciclo idCiclo;

    @OneToMany(mappedBy = "idMateria")
    private Set<Evaluacion> evaluacions = new LinkedHashSet<>();




}