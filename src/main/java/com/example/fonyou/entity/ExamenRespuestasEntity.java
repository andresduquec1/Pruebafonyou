package com.example.fonyou.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "respuestas")
public class ExamenRespuestasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String respuesta;

    private Boolean correcta;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "preguntas")
    ExamenPreguntaEntity pregunta;

}
