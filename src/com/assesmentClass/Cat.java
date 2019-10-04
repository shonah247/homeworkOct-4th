package com.assesmentClass;

public class Cat extends Feline implements Pets{
private String animalName;

    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void greet() {
        System.out.println("purrrrr");
    }
}
