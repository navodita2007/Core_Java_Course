package com.navodita.oops.polymorphism.method_overloading;

class Picture1 {
    void display(int a) {
        System.out.println(a);
    }

    void display(char a) {
        System.out.println(a);
    }
}

public class MethodOverloading4 {
    public static void main(String[] args) {
        Picture1 p = new Picture1();
        p.display(10);
        p.display('d');
    }
}
