package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year) {

    }

    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public String getColour() {
        return colour;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDetails() {
        return String.format("Make: %s, Model: %s, Colour: %s, Year: %d", make, model, colour, year);
    }

}
