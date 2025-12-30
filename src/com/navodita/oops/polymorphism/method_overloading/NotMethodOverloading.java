package com.navodita.oops.polymorphism.method_overloading;

// Regular/Normal method

class Ocean {
    void display(int a) {   // method declaration
        System.out.println("1");    // method definition
    }

    int display(String a) {    // method declaration
        System.out.println("2");    // method definition
        return 0;
    }
}

public class NotMethodOverloading {
    public static void main(String[] args) {
        Ocean o = new Ocean();
        o.display(10);
        o.display("Deepak");
    }
}
/*
 * Since method declaration in both methods are not same hence it is not method overloading.Return type of both methods are different.
 */

// This program is not Method Overloading, because conditions of method overloading is not satisfied.