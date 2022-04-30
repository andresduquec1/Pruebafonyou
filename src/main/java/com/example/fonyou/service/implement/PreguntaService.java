package com.example.fonyou.service.implement;

import com.example.fonyou.entity.ExamenPreguntaEntity;
import com.example.fonyou.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    @Autowired
    PreguntaRepository preguntaRepository;

    public List<ExamenPreguntaEntity> getAll() {
        return preguntaRepository.findAll();
    }

    public void save(ExamenPreguntaEntity examenPreguntaEntity) {
        preguntaRepository.save(examenPreguntaEntity);
    }

    public Optional<ExamenPreguntaEntity> getById(Long id) {
        return preguntaRepository.findById(id);
    }

    public void deleteById(Long id) {
        preguntaRepository.deleteById(id);
    }

    public void update(ExamenPreguntaEntity examenPreguntaEntity) {
        preguntaRepository.save(examenPreguntaEntity);
    }
}
