package com.xyz.openapi.client.controller;

import com.xyz.openapi.thinclient.api.AnimalControllerApi;
import com.xyz.openapi.thinclient.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired private AnimalControllerApi animalControllerApi;

    @GetMapping(value = "/animals")
    public List<Animal> getAnimalsByType(@RequestParam(required = false) String animalType) {
        List<Animal> animalsByType = animalControllerApi.getAnimalsByType(animalType);
        return animalsByType;
    }
}
