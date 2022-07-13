package com.github.martinfrank.ninasgameserver.repository;

import com.github.martinfrank.ninasgameserver.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
