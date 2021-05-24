package com.xyz.openapi.server.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "clazz")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
        @JsonSubTypes.Type(value = Fish.class, name = "Fish"),
        @JsonSubTypes.Type(value = Frog.class, name = "Frog")
})
public interface Animal {
    String getName();
    int getType();
}
