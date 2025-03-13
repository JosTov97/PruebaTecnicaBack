package com.tovar.swapi.controllers;

import com.tovar.swapi.models.PeopleSwapi;
import com.tovar.swapi.services.PeopleSwapiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/people")
@RestController
public class PeopleSwapiController {

    private final PeopleSwapiService peopleSwapiService;

    public PeopleSwapiController(PeopleSwapiService peopleSwapiService) {
        this.peopleSwapiService = peopleSwapiService;
    }

    @GetMapping
    public List<PeopleSwapi> getPeople() {
        return peopleSwapiService.getPeople();
    }

    @PostMapping
    public PeopleSwapi addPerson(@RequestBody PeopleSwapi person) {
        System.out.println("Recibido: " + person.toString());
        return peopleSwapiService.addPerson(person);
    }
}
