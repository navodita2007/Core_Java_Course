package com.navodita.oops;

//                      " Good programming "
// It is a good programming style because values of instance variable (int age , String color) is not initialized in
// class Animal2. They are initialized afterward as per the need of the program.
public class Animal2 {
    int age;
    String color;

    // default values of instance variables of int type, string type are assigned by JVM itself.
    // default value of string type variable is null and default value of int type variable is 0.

    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        //  System.out.println("hello");
        Animal2 buzo = new Animal2();
        buzo.age = 10;
        buzo.color = "brown";
        // initializing the values of instance variable age, color using object buzo.
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);

        buzo.eat();
        buzo.run();
        System.out.println("-------------------------------------------------");
        Animal2 cat = new Animal2();
        cat.age = 5;
        cat.color = "white";
        // initializing the values of instance variable age, color using object cat.

        System.out.println("Age : " + cat.age);
        System.out.println("Color : " + cat.color);

        cat.eat();
        cat.run();

        // We can create as many objects as we want for a single class.

        // In this programming we are able to assign different values for different objects.
    }
}
