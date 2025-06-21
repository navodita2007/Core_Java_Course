package com.navodita.oops;

// Good-Programming style because separate class for main method is made.
class Bird {
    void fly() {
        System.out.println("I am flying");
    }
}

public class Animall2 {
    void eat() {
        System.out.println("I am eating");
    }
}

class Main {   // class name can be anything.
    public static void main(String[] args) {
        Animall2 buzo = new Animall2();
        buzo.eat();

        Bird crow = new Bird();
        crow.fly();
    }
}
