package com.example.fonyou.repository;

import com.example.fonyou.entity.ExamenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends JpaRepository<ExamenEntity, Long> {
}
