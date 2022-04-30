package com.example.fonyou.repository;

import com.example.fonyou.entity.ExamenPreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<ExamenPreguntaEntity, Long> {
}
