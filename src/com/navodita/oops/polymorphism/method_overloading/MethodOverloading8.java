package com.navodita.oops.polymorphism.method_overloading;

class Cinema {
    void display(Object a) {
        System.out.println("1");
    }

    void display(String a) {
        System.out.println("2");
    }
}

public class MethodOverloading8 {
    public static void main(String[] args) {
        Cinema c = new Cinema();
        c.display(null);
    }
}
/**
 * Object is the parent class of all classes in java.String class directly inherits the object class.
 * If I am providing null value as argument then it will call the String class because String is
 * a child class here.Compiler will call the method of child class first (because all classes has
 * same value, hence child class is preferred first).
 * If child class is not found then parent class is preferred. Here parent class is Object.
 */