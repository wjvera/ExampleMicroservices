package com.microservice.zoo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimalsDTO {
    private String name;
    private String alimentacion;
    private String sexo;
    private long zooId;
}
