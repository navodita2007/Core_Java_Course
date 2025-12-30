package com.navodita.oops.polymorphism.method_overloading;

class Ocean1 {
    //static void display(int a) {
    final void display(int a) {
        System.out.println("1");
    }

    void display(String a) {
        System.out.println("2");
    }
}

public class NotMethodOverloading1 {
    public static void main(String[] args) {
        Ocean1 o = new Ocean1();
        o.display(10);
        o.display("Deepak");
    }
}


// This program is not Method Overloading, because conditions of method overloading is not satisfied.
// Here we are experimenting with final and static keyword in method declaration. And observing the output.