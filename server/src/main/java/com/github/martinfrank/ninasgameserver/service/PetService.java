package com.github.martinfrank.ninasgameserver.service;

import com.github.martinfrank.ninasgameserver.model.Pet;

import java.util.List;

public interface PetService {

    Pet create(Pet pet);

    Pet update(Pet pet);

    List<Pet> getAll();

    Pet getById(long id);

    void delete(long id);

    List<Pet> getByIds(List<Long> petIds);
}
