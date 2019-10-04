package com.assesmentClass;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fluffy");
        Dog dog1 = new Dog("Oreo");


        Pets[]pet={dog1,cat1};
        petGreetings(pet);



    }

    static void petGreetings(Pets[]pet) {
        for(Pets a:pet)
            a.greet();
        }
    }
