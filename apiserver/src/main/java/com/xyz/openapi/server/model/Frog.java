package com.xyz.openapi.server.model;

public class Frog implements Animal{
    private String name = "frog";
    private int type = AnimalType.AMPHIBIAN.index();

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
