package com.navodita.oops.polymorphism.method_overloading;

// With differnt sequence of parameters
class Picture {
    void display(String a, int b) {
        System.out.println(a + ", " + b);
    }

    void display(int a, String b) {
        System.out.println(a + ", " + b);
    }
}

public class MethodOverloading3 {
    public static void main(String[] args) {
        Picture p = new Picture();
        p.display(10, "Deepak");
        p.display("Deepak", 10);
    }
}
