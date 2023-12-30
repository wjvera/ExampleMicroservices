package com.microservice.zoo.persistence;

import com.microservice.zoo.entities.Zoo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZooRepository extends CrudRepository<Zoo, Long> {
}
