package com.example.fonyou.repository;

import com.example.fonyou.entity.ExamenRespuestasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<ExamenRespuestasEntity, Long> {
}
