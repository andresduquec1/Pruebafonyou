package com.example.fonyou.rest;

import com.example.fonyou.entity.CiudadEntity;
import com.example.fonyou.service.implement.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/ciudades")
public class CiudadController {

    @Autowired
    CiudadService ciudadService;

    @GetMapping("/getall")
    public List<CiudadEntity> getEstudiante(){
        return ciudadService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody CiudadEntity ciudadEntity){
        ciudadService.save(ciudadEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<CiudadEntity> getById(@PathVariable Long id){
        return ciudadService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        ciudadService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody CiudadEntity ciudadEntity){
        ciudadService.update(ciudadEntity);
    }
}
