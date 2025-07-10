package com.navodita.oops;

// Not-Good Programming Style because separate class for main method is not created.
class Birds {
    void fly() {
        System.out.println("I am flying");
    }

    public static void main(String[] args) {
        Animall1 buzo = new Animall1();
        buzo.eat();

        Birds crow = new Birds();
        crow.fly();
    }
}

public class Animall1 {
    void eat() {
        System.out.println("I am eating");
    }


}
