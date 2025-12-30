package com.navodita.oops.polymorphism.method_overloading;

// With different types (different data types) of parameters
class Frame3 {
    void display(String a) {
        System.out.println(a);
    }

    void display(int a) {
        System.out.println(a);
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Frame3 f = new Frame3();
        f.display("Navodita");
        f.display(10);
    }
}

