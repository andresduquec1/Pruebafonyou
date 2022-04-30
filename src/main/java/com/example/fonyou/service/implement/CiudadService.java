package com.example.fonyou.service.implement;


import com.example.fonyou.entity.CiudadEntity;
import com.example.fonyou.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {

    @Autowired
    CiudadRepository ciudadRepository;

    public List<CiudadEntity> getAll(){
        return ciudadRepository.findAll();
    }

    public void save(CiudadEntity ciudadEntity){
        ciudadRepository.save(ciudadEntity);
    }

    public Optional<CiudadEntity> getById(Long id){
        return ciudadRepository.findById(id);
    }

    public void deleteById(Long id){
        ciudadRepository.deleteById(id);
    }

    public void update(CiudadEntity ciudadEntity){
        ciudadRepository.save(ciudadEntity);
    }
}
