package com.assesmentClass;

public abstract class Animal {
    private String animalName;

    public String getAnimalName () {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public void speak(){
        System.out.println();
    }
}
