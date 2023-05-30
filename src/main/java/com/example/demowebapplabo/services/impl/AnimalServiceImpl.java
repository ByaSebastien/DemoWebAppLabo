package com.example.demowebapplabo.services.impl;

import com.example.demowebapplabo.models.dtos.AnimalDTO;
import com.example.demowebapplabo.models.entities.Animal;
import com.example.demowebapplabo.models.forms.AnimalForm;
import com.example.demowebapplabo.repositories.AnimalRepository;
import com.example.demowebapplabo.services.AnimalService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import org.hibernate.service.spi.InjectService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Inject;

@Named
@SessionScoped
public class AnimalServiceImpl implements AnimalService, Serializable {

    @Inject
    private AnimalRepository animalRepository;

    @Override
    public void add(AnimalForm a) {
        animalRepository.add(a.toEntity());
    }

    @Override
    public AnimalDTO getOne(Long id) {
        return null;
    }

    @Override
    public List<AnimalDTO> getAll() {
        List<AnimalDTO> animalsDTO = new ArrayList<>();
        List<Animal> animals = animalRepository.getAll();
        for (Animal a : animals){
            animalsDTO.add(AnimalDTO.fromEntity(a));
        }
        return  animalsDTO;
    }


    @Override
    public Animal update(Long id, AnimalForm a) {
        return null;
    }

    @Override
    public Animal delete(Long id) {
        return null;
    }
}
