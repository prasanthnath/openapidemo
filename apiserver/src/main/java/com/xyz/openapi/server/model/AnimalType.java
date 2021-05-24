package com.xyz.openapi.server.model;

public enum AnimalType {
    LAND(0),
    AQUATIC(1),
    AMPHIBIAN(2);

    private int index;
    AnimalType(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
