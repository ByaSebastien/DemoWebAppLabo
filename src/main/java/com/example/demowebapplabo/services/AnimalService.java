package com.example.demowebapplabo.services;

import com.example.demowebapplabo.models.dtos.AnimalDTO;
import com.example.demowebapplabo.models.entities.Animal;
import com.example.demowebapplabo.models.forms.AnimalForm;

import java.util.List;

public interface AnimalService {

    void add(AnimalForm a);

    AnimalDTO getOne(Long id);

    List<AnimalDTO> getAll();

    Animal update(Long id, AnimalForm a);

    Animal delete(Long id);
}
