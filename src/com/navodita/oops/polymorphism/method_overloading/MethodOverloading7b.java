package com.navodita.oops.polymorphism.method_overloading;

class Movie {
    void display(int... a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class MethodOverloading7b {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.display();
        m.display(10);
        m.display(20, 30);
    }
}
// for-each loop or even for loop is generally used while using var-args.