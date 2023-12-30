package com.microservice.zoo.client;

import com.microservice.zoo.dto.AnimalsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "micro-animals", url = "localhost:8090/api/animals")
public interface AnimalClient {
    @GetMapping("/search-by-zoo/{idZoo}")
    List<AnimalsDTO> findAllAnimalsByZoo(@PathVariable Long idZoo);
}
