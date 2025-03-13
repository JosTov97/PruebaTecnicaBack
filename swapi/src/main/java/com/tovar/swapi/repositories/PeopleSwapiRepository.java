package com.tovar.swapi.repositories;

import com.tovar.swapi.models.PeopleSwapi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleSwapiRepository extends JpaRepository<PeopleSwapi,Long> {
}
