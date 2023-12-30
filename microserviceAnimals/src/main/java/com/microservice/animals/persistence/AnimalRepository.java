package com.microservice.animals.persistence;

import com.microservice.animals.entities.Animals;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends CrudRepository<Animals, Long> {

    @Query("SELECT a FROM Animals a WHERE a.zooId = :idZoo")
    List<Animals> findAllAnimals(Long idZoo);

    //List<Animals> findAllByZooId(Long idZoo);
}
