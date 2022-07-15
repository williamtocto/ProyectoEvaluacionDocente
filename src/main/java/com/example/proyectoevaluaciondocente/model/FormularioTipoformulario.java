package com.example.proyectoevaluaciondocente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "formulario_tipoformulario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormularioTipoformulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formulariotipoformulario", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_formulario")
    private Formulario idFormulario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipo_formulario")
    private TipoFormulario idtipoFormulario;


}