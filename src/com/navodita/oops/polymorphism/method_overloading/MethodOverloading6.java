package com.navodita.oops.polymorphism.method_overloading;

class Television {
    void display(int a) {
        System.out.println("1 : " + a);
    }

    void display(char c) {
        System.out.println("2 : " + c);
    }
}

public class MethodOverloading6 {
    public static void main(String[] args) {
        Television t = new Television();
        t.display('d');
        t.display(10);
    }
}
