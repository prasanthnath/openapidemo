package com.xyz.openapi.server.model;

public class Cat implements Animal {
    private String name = "cat";
    private int type = AnimalType.LAND.index();
    private int pawCount = 4;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getType() {
        return type;
    }

    public int getPawCount() {
        return pawCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPawCount(int pawCount) {
        this.pawCount = pawCount;
    }
}
