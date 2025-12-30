package com.navodita.oops.polymorphism.method_overloading;

class Picture3 {
    void display(char a) {
        System.out.println(a);
    }
}

public class MethodOverloading5b {
    public static void main(String[] args) {
        Picture3 p = new Picture3();
        p.display((char) 100);// -> Type-casting
    }
}
