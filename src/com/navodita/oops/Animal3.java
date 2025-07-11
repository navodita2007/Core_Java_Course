package com.navodita.oops;

// """""  DEFAULT CONSTRUCTOR  """""
public class Animal3 {
    int age;
    String color;

    // This is not a good programming because values of both objects are same.
    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        //  System.out.println("hello");
        Animal3 buzo = new Animal3();
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);

        buzo.eat();
        buzo.run();

        Animal3 cat = new Animal3();
        System.out.println("Age : " + cat.age);
        System.out.println("Color : " + cat.color);

        cat.eat();
        cat.run();

        // We can create as many objects as we want for a single class.
    }
}

// Use of Constructor :- Constructors are used to initialize an object but not for object creation.
// Default values( int -> 0 , string -> null ) of instance variable is initialized by default constructor which is automatically created by compiler.
// Default constructors are used to provide the default values to the objects like 0, null etc. depending on the type.