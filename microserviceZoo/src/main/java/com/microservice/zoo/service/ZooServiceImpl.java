package com.microservice.zoo.service;

import com.microservice.zoo.client.AnimalClient;
import com.microservice.zoo.dto.AnimalsDTO;
import com.microservice.zoo.entities.Zoo;
import com.microservice.zoo.http.response.AnimalsByZooResponse;
import com.microservice.zoo.persistence.IZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooServiceImpl implements IZooService{

    @Autowired
    private IZooRepository zooRepository;
    @Autowired
    private AnimalClient animalClient;

    @Override
    public List<Zoo> findAll() {
        return (List<Zoo>) zooRepository.findAll();
    }

    @Override
    public Zoo findById(Long id) {
        return zooRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Zoo zoo) {
        zooRepository.save(zoo);
    }

    @Override
    public AnimalsByZooResponse findAnimalsByIdZoo(Long idZoo) {

        Zoo zoo = zooRepository.findById(idZoo).orElse(new Zoo());

        List<AnimalsDTO> animalsDTOList = animalClient.findAllAnimalsByZoo(idZoo);
        return AnimalsByZooResponse.builder()
                .namezoo(zoo.getNamezoo())
                .locationzoo(zoo.getLocationzoo())
                .animalsDTOList(animalsDTOList)
                .build();
    }
}
