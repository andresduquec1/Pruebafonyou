package com.example.fonyou.rest;


import com.example.fonyou.entity.EstudianteEntity;
import com.example.fonyou.service.implement.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/getall")
    public List<EstudianteEntity> getEstudiante(){
        return estudianteService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody EstudianteEntity estudianteEntity){
        estudianteService.save(estudianteEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<EstudianteEntity> getById(@PathVariable Long id){
        return estudianteService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        estudianteService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody EstudianteEntity estudianteEntity){
        estudianteService.update(estudianteEntity);
    }
}
