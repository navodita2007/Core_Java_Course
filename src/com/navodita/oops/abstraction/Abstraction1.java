package com.navodita.oops.abstraction;

//        " USING METHOD OVERLOADING IN ABSTRACTION "
class Tools {

}

abstract class Screw extends Tools {
    void sum() {

    }

    abstract void show();

    abstract void show(int a);
}

class axe extends Tools {
    void show() {

    }

    void show(int a) {

    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Screw ob1;
    }
}
