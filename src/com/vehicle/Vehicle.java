package com.vehicle;

public abstract class Vehicle {
    private double wheels;
    protected String name;

    public double getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void setWheels(double wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(double wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }

    public void printNumberOfWheels() {
        System.out.println("ten wheels");
    }
}

