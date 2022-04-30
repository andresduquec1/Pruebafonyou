package com.example.fonyou.service.implement;


import com.example.fonyou.entity.PaisEntity;
import com.example.fonyou.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {

    @Autowired
    PaisRepository paisRepository;

    public List<PaisEntity> getAll() {
        return paisRepository.findAll();
    }

    public void save(PaisEntity paisEntity) {
        paisRepository.save(paisEntity);
    }

    public Optional<PaisEntity> getById(Long id) {
        return paisRepository.findById(id);
    }

    public void deleteById(Long id) {
        paisRepository.deleteById(id);
    }

    public void update(PaisEntity paisEntity) {
        paisRepository.save(paisEntity);
    }
}
