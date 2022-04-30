package com.example.fonyou.repository;

import com.example.fonyou.entity.CiudadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<CiudadEntity, Long> {
}
