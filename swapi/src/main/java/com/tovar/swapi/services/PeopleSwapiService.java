package com.tovar.swapi.services;

import com.tovar.swapi.models.PeopleSwapi;
import com.tovar.swapi.repositories.PeopleSwapiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleSwapiService {

    private final PeopleSwapiRepository peopleSwapiRepository;

    public PeopleSwapiService(PeopleSwapiRepository peopleSwapiRepository) {
        this.peopleSwapiRepository = peopleSwapiRepository;
    }

    public List<PeopleSwapi> getPeople() {
        return peopleSwapiRepository.findAll();
    }

    public PeopleSwapi addPerson(PeopleSwapi person) {

        // Imprimir para verificar si el objeto se está recibiendo correctamente
        System.out.println("Guardando persona: " + person);
        return peopleSwapiRepository.save(person);
    }
}
