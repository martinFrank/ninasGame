package com.github.martinfrank.ninasgameserver.service;

import com.github.martinfrank.ninasgameserver.model.Person;

import java.util.List;

public interface PersonService {

    Person create(Person person);

    Person update(Person person);

    List<Person> getAll();

    Person getById(long id);

    void delete(long id);

}
