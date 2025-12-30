package com.navodita.oops.polymorphism.method_overloading;

class Hospital {
    Hospital() {
        System.out.println("1");
    }

    Hospital(int a) {
        System.out.println("2");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        //  Hospital h1 = new Hospital();
        //  Hospital h2 = new Hospital(10);
        new Hospital();
        new Hospital(10);
    }
}

/**
 * Can we overload constructor?  Yes we can overload constructor.
 */