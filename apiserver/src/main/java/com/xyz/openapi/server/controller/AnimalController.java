package com.xyz.openapi.server.controller;

import com.xyz.openapi.server.model.Animal;
import com.xyz.openapi.server.model.AnimalType;
import org.apache.commons.lang3.StringUtils;
import org.reflections.Reflections;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @GetMapping(value = "/")
    public Animal[] getAnimalsByType(@RequestParam(required = false) String animalType) {
        AnimalType type = StringUtils.isNotBlank(animalType) ? AnimalType.valueOf(animalType) : null;
        Reflections reflections = new Reflections("com.xyz.openapi.server.model");
        return reflections.getSubTypesOf(Animal.class).stream()
                .map(animal -> {
                    try {
                        return animal.getDeclaredConstructor().newInstance();
                    } catch (InstantiationException | IllegalAccessException |
                            NoSuchMethodException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                })
                .filter(animal -> animalType == null || type.index() == animal.getType())
                .toArray(Animal[] :: new);
    }
}
