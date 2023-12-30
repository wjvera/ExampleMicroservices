package com.microservice.zoo.http.response;

import com.microservice.zoo.dto.AnimalsDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimalsByZooResponse {

    private String namezoo;
    private String locationzoo;
    private List<AnimalsDTO> animalsDTOList;

}
