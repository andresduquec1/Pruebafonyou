package com.example.fonyou.rest;



import com.example.fonyou.entity.ExamenEntity;
import com.example.fonyou.service.implement.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/examen")
public class ExamenController {

    @Autowired
    ExamenService examenService;

    @GetMapping("/getall")
    public List<ExamenEntity> getAll(){
        return examenService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody ExamenEntity examenEntity){
        examenService.save(examenEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<ExamenEntity> getById(@PathVariable Long id){
        return examenService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        examenService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ExamenEntity examenEntity){
        examenService.update(examenEntity);
    }
}
