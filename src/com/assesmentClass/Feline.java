package com.assesmentClass;

public abstract class Feline extends Animal  {


    public Feline(String animalName) {
        super(animalName);
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }
        }
