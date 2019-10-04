package com.assesmentClass;

public class Dog extends Canine implements Pets {

    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    public void greet() {
        System.out.println("Hey i can talk");
    }
}

