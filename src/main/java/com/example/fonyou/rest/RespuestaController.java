package com.example.fonyou.rest;

import com.example.fonyou.entity.ExamenRespuestasEntity;
import com.example.fonyou.service.implement.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("v1/api/respuestas")
public class RespuestaController {

    @Autowired
    RespuestaService respuestaService;

    @GetMapping("/getall")
    public List<ExamenRespuestasEntity> getRespuestas(){
        return respuestaService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody ExamenRespuestasEntity examenRespuestasEntity){
        respuestaService.save(examenRespuestasEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<ExamenRespuestasEntity> getById(@PathVariable Long id){
        return respuestaService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        respuestaService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ExamenRespuestasEntity examenRespuestasEntity){
        respuestaService.update(examenRespuestasEntity);
    }

}
