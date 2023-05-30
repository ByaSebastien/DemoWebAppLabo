package com.example.demowebapplabo.repositories.impl;

import com.example.demowebapplabo.models.entities.Animal;
import com.example.demowebapplabo.repositories.AnimalRepository;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.persistence.TypedQuery;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class AnimalRepositoryImpl extends BaseRepositoryImpl<Long, Animal> implements AnimalRepository, Serializable {
    @Override
    public List<Animal> getAll() {
        TypedQuery<Animal> query = em.createQuery("select a from Animal a", Animal.class);
        return query.getResultList();
    }
}
