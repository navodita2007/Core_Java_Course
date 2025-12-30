package com.navodita.oops.abstraction;

//  INTERFACE USING STATIC-METHOD
interface I5 {
    static void show() {
        System.out.println("I am static method");
    }
}

public class InterfaceNewFeatures2 {
    public static void main(String[] args) {
        I5.show();// we don't have to create an object, we can directly call the method via interface, if we use static-method.
    }
}
