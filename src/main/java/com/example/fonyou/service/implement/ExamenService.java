package com.example.fonyou.service.implement;

import com.example.fonyou.entity.ExamenEntity;
import com.example.fonyou.repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamenService {

    @Autowired
    ExamenRepository examenRepository;

    public List<ExamenEntity> getAll() {
        return examenRepository.findAll();
    }

    public void save(ExamenEntity examenEntity) {
        examenRepository.save(examenEntity);
    }

    public Optional<ExamenEntity> getById(Long id) {
        return examenRepository.findById(id);
    }

    public void deleteById(Long id) {
        examenRepository.deleteById(id);
    }

    public void update(ExamenEntity examenEntity) {
        examenRepository.save(examenEntity);
    }
}
