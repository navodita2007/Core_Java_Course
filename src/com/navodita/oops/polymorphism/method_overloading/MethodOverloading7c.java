package com.navodita.oops.polymorphism.method_overloading;

class HomeTown {
    void display(int a) {
        System.out.println("First method : " + a);
    }

    void display(int... a) {
        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}

public class MethodOverloading7c {
    public static void main(String[] args) {
        HomeTown h = new HomeTown();
        h.display();
        h.display(10);
        h.display(20, 30);

    }
}
