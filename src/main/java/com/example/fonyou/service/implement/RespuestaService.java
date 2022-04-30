package com.example.fonyou.service.implement;

import com.example.fonyou.entity.ExamenRespuestasEntity;
import com.example.fonyou.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespuestaService {

    @Autowired
    RespuestaRepository respuestaRepository;

    public List<ExamenRespuestasEntity> getAll() {
        return respuestaRepository.findAll();
    }

    public void save(ExamenRespuestasEntity examenRespuestasEntity) {
        respuestaRepository.save(new ExamenRespuestasEntity());
    }

    public Optional<ExamenRespuestasEntity> getById(Long id) {
        return respuestaRepository.findById(id);
    }

    public void deleteById(Long id) {
        respuestaRepository.deleteById(id);
    }

    public void update(ExamenRespuestasEntity examenRespuestasEntity) {
        respuestaRepository.save(examenRespuestasEntity);
    }
}
