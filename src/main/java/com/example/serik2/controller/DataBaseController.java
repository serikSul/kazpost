package com.example.serik2.controller;

import com.example.serik2.dto.DataBaseDto;
import com.example.serik2.dto.ServicesDto;
import com.example.serik2.model.DataBase;
import com.example.serik2.model.KazpostService;
import com.example.serik2.repo.DataBaseRepo;
import com.example.serik2.repo.KazpostServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/db",produces = "application/json")
public class DataBaseController {
    @Autowired
    private DataBaseRepo dbRepo;

    @GetMapping
    public List<DataBaseDto> getAllDb(){
        return dbRepo.findAll()
                .stream()
                .map(DataBaseDto::mapDataBaseToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public ResponseEntity<DataBase> getDbById(@PathVariable("id") int id){
        Optional<DataBase> serviceOptional=dbRepo.findById(id);
        if (serviceOptional.isPresent()){
            return new ResponseEntity<>(serviceOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @PostMapping(consumes = "application/json")
    public DataBase postService(@RequestBody DataBase dataBase){
        return dbRepo.save(dataBase);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteDbById(@PathVariable("id") int id){
        dbRepo.deleteById(id);
    }
}
