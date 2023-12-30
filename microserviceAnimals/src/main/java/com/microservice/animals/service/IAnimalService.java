package com.microservice.animals.service;

import com.microservice.animals.entities.Animals;

import java.util.List;

public interface IAnimalService {

    List<Animals> findAll();

    Animals findById(Long id);

    void save (Animals animals);

    List<Animals> findByIdZoo(Long idZoo);
}
