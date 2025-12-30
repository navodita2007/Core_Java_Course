package com.navodita.oops.polymorphism.method_overloading;

public class MethodOverloading10 {
    public static void main(String[] args) {   // Original main method
        System.out.println("1");
        MethodOverloading10 ob = new MethodOverloading10();
        int[] arr = {10, 20};
        ob.main(arr);   // We are calling the lower main method through the object created.
    }

    public static void main(int[] args) {
        System.out.println("2");
    }
    // We can write different syntaxes of main method. But JVM searches for original main method.

}

// Can we overload main method? Yes we can overload main method.
// Main method can be overloaded by different parameters.
