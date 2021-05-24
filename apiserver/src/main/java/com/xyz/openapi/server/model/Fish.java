package com.xyz.openapi.server.model;

public class Fish implements Animal {
    private String name = "fish";
    private int type = AnimalType.AQUATIC.index();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }
}
