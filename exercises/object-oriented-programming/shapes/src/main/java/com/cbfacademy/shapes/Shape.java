package com.cbfacademy.shapes;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // abstract method for area
    public abstract double getArea();


    public String getName() {
        return name;
    }
}
