package com.example.fonyou.service.implement;

import com.example.fonyou.entity.EstudianteEntity;
import com.example.fonyou.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    public List<EstudianteEntity> getAll(){
        return estudianteRepository.findAll();
    }

    public void save(EstudianteEntity estudianteEntity){
        estudianteRepository.save(estudianteEntity);
    }

    public Optional<EstudianteEntity> getById(Long id){
        return estudianteRepository.findById(id);
    }

    public void deleteById(Long id){
        estudianteRepository.deleteById(id);
    }

    public void update(EstudianteEntity estudianteEntity){
        estudianteRepository.save(estudianteEntity);
    }
}
