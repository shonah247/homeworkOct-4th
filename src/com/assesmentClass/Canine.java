package com.assesmentClass;

public abstract class Canine extends Animal{
    public Canine(String animalName) {
        super(animalName);
    }

    @Override
    public void speak() {
        System.out.println("woof");

    }
}
