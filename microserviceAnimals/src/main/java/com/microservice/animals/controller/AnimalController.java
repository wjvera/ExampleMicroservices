package com.microservice.animals.controller;

import com.microservice.animals.entities.Animals;
import com.microservice.animals.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired
    private IAnimalService animalService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAnimal(@RequestBody Animals animals){
        animalService.save(animals);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllAnimals(){
        return ResponseEntity.ok(animalService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(animalService.findById(id));
    }

    @GetMapping("/search-by-zoo/{idZoo}")
    public ResponseEntity<?> findByIdZoo(@PathVariable Long idZoo){
        return ResponseEntity.ok(animalService.findByIdZoo(idZoo));
    }

}
