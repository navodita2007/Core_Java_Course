package com.navodita.oops;

public class Animal {
    int age = 10;
    String color = "black";

    // This is not a good programming because values of both objects are same.
    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        //  System.out.println("hello");
        Animal buzo = new Animal();
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);

        buzo.eat();
        buzo.run();

        Animal cat = new Animal();
        System.out.println("Age : " + cat.age);
        System.out.println("Color : " + cat.color);

        cat.eat();
        cat.run();

        // We can create as many objects as we want for a single class.
    }
}
// Use of Constructor :- Constructors are used to initialize an object but not for object creation.