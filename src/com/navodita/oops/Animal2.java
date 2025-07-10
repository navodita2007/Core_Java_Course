package com.navodita.oops;

//                      " Good programming "
/* It is a good programming style because values of instance variable (int age , String color) is
 not initialized in class Animal2. They are initialized afterward as per the need of the program.
 */
public class Animal2 {    // This is known as Concrete class or Simple class.
    int age;
    String color;

    /* default values of instance variables of int type, string type are assigned by JVM itself.
     default value of string type variable is null and default value of int type variable is 0. */

    void eat() {    // This is known as Concrete method. Those methods which has body are known as Concrete methods.
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
        // initializing the values of instance variables age, color inside object buzo on our own because of which number of code lines are increased significantly.
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);

        buzo.eat();
        buzo.run();
        System.out.println("-------------------------------------------------");
        Animal2 cat = new Animal2();
        cat.age = 5;
        cat.color = "white";
        // initializing the values of instance variable age, color inside object cat on our own because of which number of code lines are increased significantly.

        System.out.println("Age : " + cat.age);
        System.out.println("Color : " + cat.color);

        cat.eat();
        cat.run();

        // We can create as many objects as we want for a single class.

    }
}

/* Advantage of this type of programming :-
   In this programming we are able to assign different values for different objects. */

/* Disadvantage of this type of programming and its solution :-
 Suppose if there are 1000s of objects in the above program, then for each object two instance
 variables will be initialized, then total 2000 instance variables will be created, hence 2000
 lines of code will be created extra.To avoid extra creation of 2000 lines of code constructor
 should be used. */

/* Constructor : Constructors are the special methods having same name as that of class name and
 does not have any return type. */

// Use of Constructor :- Constructors are used to initialize an object but not for object creation.