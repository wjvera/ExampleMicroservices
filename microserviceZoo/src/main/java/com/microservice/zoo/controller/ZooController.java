package com.microservice.zoo.controller;

import com.microservice.zoo.entities.Zoo;
import com.microservice.zoo.service.IZooService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/zoo")
public class ZooController {

    private IZooService zooService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAnimals(@RequestBody Zoo zoo){
        zooService.save(zoo);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllAnimals(){
        return ResponseEntity.ok(zooService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(zooService.findById(id));
    }

    @GetMapping("/search-animals/{idZoo}")
    public ResponseEntity<?> findAnimalsByIdZoo(@PathVariable Long idZoo){
        return ResponseEntity.ok(zooService.findAnimalsByIdZoo(idZoo));
    }

}
