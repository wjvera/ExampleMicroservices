package com.microservice.zoo.service;

import com.microservice.zoo.entities.Zoo;
import com.microservice.zoo.http.response.AnimalsByZooResponse;

import java.util.List;

public interface IZooService {

    List<Zoo> findAll();

    Zoo findById(Long id);

    void save (Zoo zoo);

    AnimalsByZooResponse findAnimalsByIdZoo(Long idZoo);
}
