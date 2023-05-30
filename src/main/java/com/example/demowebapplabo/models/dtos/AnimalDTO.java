package com.example.demowebapplabo.models.dtos;

import com.example.demowebapplabo.models.entities.Animal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class AnimalDTO {
    private String name;

    public static AnimalDTO fromEntity(Animal a){
        return new AnimalDTO(a.getName());
    }
}
