package com.navodita.oops.abstraction;

//                                                      " ABSTRACTION "
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("starts with key");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("starts with kick");
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        Car ob = new Car();
        ob.start();
        System.out.println("-------------------------------------------------");
        Scooter ob2 = new Scooter();
        ob2.start();
    }
}
// In abstarction , concept of method overriding can also be seen.

/*
 * POINTS TO REMEMBER -:
 * If any class contains abstract methods then that class should be declared as abstract class.
 * If we declare any abstract class, then it can contain both concrete methods and abstract methods & also it can just contain only concrete methods.
 * We cannot create an object of abstract class, we cannot instantiate an abstract class, we can declare reference for an abstract class.
 * if any class inherits abstract class then it should implement all the abstract methods or that class should also be declared as abstract.
 * Whenever we use abstraction concept we are using method overriding concept also.
 * Abstract class can have constructors.
 * Abstract class can inherit concrete class.
 * We can overload abstract methods.
 * */