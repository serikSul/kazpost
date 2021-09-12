package com.example.serik2.controller;

import com.example.serik2.dto.ServicesDto;
import com.example.serik2.model.KazpostService;
import com.example.serik2.repo.KazpostServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api",produces = "application/json")
public class ServiceController {
    @Autowired
    private KazpostServiceRepo serviceRepo;

    @GetMapping
    public List<ServicesDto> getAllService(){
        return serviceRepo.findAll()
                .stream()
                .map(ServicesDto::mapServiceToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public ResponseEntity<KazpostService> getServiceById(@PathVariable("id") int id){
        Optional<KazpostService> serviceOptional=serviceRepo.findById(id);
        if (serviceOptional.isPresent()){
            return new ResponseEntity<>(serviceOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @PostMapping(consumes = "application/json")
    public KazpostService postService(@RequestBody KazpostService service){
        return serviceRepo.save(service);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteServiceById(@PathVariable("id") int id){
        serviceRepo.deleteById(id);
    }
}
