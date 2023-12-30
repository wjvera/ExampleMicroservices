package com.microservice.animals.service;

import com.microservice.animals.entities.Animals;
import com.microservice.animals.persistence.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsServiceImpl implements IAnimalService{

    @Autowired
    private AnimalRepository animalRepository;
    @Override
    public List<Animals> findAll() {
        return (List<Animals>) animalRepository.findAll();
    }

    @Override
    public Animals findById(Long id) {
        return animalRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Animals animals) {
        animalRepository.save(animals);
    }

    @Override
    public List<Animals> findByIdZoo(Long idZoo) {
        return animalRepository.findAllAnimals(idZoo);
    }
}
