package com.example.serik2.controller;

import com.example.serik2.dto.DataBaseDto;
import com.example.serik2.dto.DeveloperDto;
import com.example.serik2.model.DataBase;
import com.example.serik2.model.Developer;
import com.example.serik2.repo.DataBaseRepo;
import com.example.serik2.repo.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/dev",produces = "application/json")
public class DeveloperController {
    @Autowired
    private DeveloperRepo devRepo;

    @GetMapping
    public List<DeveloperDto> getAllDev(){
        return devRepo.findAll()
                .stream()
                .map(DeveloperDto::mapDeveloperToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public ResponseEntity<Developer> getDevById(@PathVariable("id") int id){
        Optional<Developer> serviceOptional=devRepo.findById(id);
        if (serviceOptional.isPresent()){
            return new ResponseEntity<>(serviceOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @PostMapping(consumes = "application/json")
    public Developer postDev(@RequestBody Developer developer){
        return devRepo.save(developer);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteDevById(@PathVariable("id") int id){
        devRepo.deleteById(id);
    }
}
