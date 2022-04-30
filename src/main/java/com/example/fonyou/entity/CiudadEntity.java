package com.example.fonyou.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ciudades")
public class CiudadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

    private String ZonaHoraria;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "paises")
    PaisEntity pais;

    @JsonManagedReference
    @OneToMany(mappedBy = "ciudad", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EstudianteEntity> estudiantes;

}
