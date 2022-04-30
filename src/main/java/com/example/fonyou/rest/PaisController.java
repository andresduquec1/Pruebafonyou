package com.example.fonyou.rest;

import com.example.fonyou.entity.PaisEntity;
import com.example.fonyou.service.implement.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/paises")
public class PaisController {

    @Autowired
    PaisService paisService;

    @GetMapping("/getall")
    public List<PaisEntity> getPaises(){
        return paisService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody PaisEntity paisEntity){
        paisService.save(paisEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<PaisEntity> getById(@PathVariable Long id){
        return paisService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        paisService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody PaisEntity paisEntity){
        paisService.update(paisEntity);
    }

}
