package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "materia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_Materia", length = 45)
    private String nombreMateria;


    @Column(name = "id_ciclo")
    private int id_Ciclo;

    /*
    @OneToMany(mappedBy = "idMateria")
    private Set<Evaluacion> evaluacions = new LinkedHashSet<>();*/

}