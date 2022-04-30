package com.example.fonyou.rest;

import com.example.fonyou.entity.ExamenPreguntaEntity;
import com.example.fonyou.service.implement.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("v1/api/preguntas")
public class PreguntaController {

    @Autowired
    PreguntaService preguntaService;

    @GetMapping("/getall")
    public List<ExamenPreguntaEntity> getPaises(){
        return preguntaService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody ExamenPreguntaEntity examenPreguntaEntity){
        preguntaService.save(examenPreguntaEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<ExamenPreguntaEntity> getById(@PathVariable Long id){
        return preguntaService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        preguntaService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ExamenPreguntaEntity examenPreguntaEntity){
        preguntaService.update(examenPreguntaEntity);
    }

}
