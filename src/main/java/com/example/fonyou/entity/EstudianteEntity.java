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
@Table(name = "estudiantes")
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

    private String edad;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "ciudades")
    CiudadEntity ciudad;

}
