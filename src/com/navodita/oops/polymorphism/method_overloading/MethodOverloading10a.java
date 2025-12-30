package com.navodita.oops.polymorphism.method_overloading;

public class MethodOverloading10a {
    public static void main(String[] args) {   // Original main method
        System.out.println("1");
        MethodOverloading10a ob = new MethodOverloading10a();
        ob.main("Deepak");
    }

    public static void main(String args) {
        System.out.println("2");
    }
    // We can write different syntaxes of main method. But JVM searches for original main method.

}

// Can we overload main method? Yes we can overload main method.