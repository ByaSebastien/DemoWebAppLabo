package com.example.demowebapplabo.repositories.impl;

import com.example.demowebapplabo.models.entities.Animal;
import com.example.demowebapplabo.repositories.BaseRepository;
import jakarta.persistence.*;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;


public abstract class BaseRepositoryImpl<TKey,TEntity extends Object> implements BaseRepository<TKey,TEntity> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public BaseRepositoryImpl() {

        this.emf = Persistence.createEntityManagerFactory("DemoLaboJava23");
        this.em = emf.createEntityManager();
    }

    @Override
    public TEntity add(TEntity entity) {

        em.getTransaction().begin();

        em.persist(entity);

        em.getTransaction().commit();

        return entity;
    }

    @Override
    public Optional<TEntity> getOne(TKey id) {
        return Optional.empty();
    }

    @Override
    public abstract List<TEntity> getAll();

    @Override
    public TEntity update(TEntity entity) {
        return null;
    }

    @Override
    public TEntity delete(TKey id) {
        return null;
    }
}
