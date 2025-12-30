package com.navodita.oops.polymorphism.method_overloading;

class Television1 {
    void display(int a) {
        System.out.println("1 : " + a);
    }

    void display(int... a) {    // ... -> var args i.e., variable arguements. var args can take no argument or 1 argument or 2 argument.
        System.out.println("2 : " + a);
    }
}

public class MethodOverloading7 {
    public static void main(String[] args) {
        Television1 t = new Television1();
        t.display();
        t.display(10);
    }
}
