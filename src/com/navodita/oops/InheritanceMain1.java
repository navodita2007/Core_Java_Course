package com.navodita.oops;

class C {
    // private int aa = 10;       -> private members of parent class are not inherited in child class
    int aa = 10;

    //  private void show() {      -> private members of parent class are not inherited in child class
    void show() {
        System.out.println("hi");
    }
}

class D extends C {

}

public class InheritanceMain1 {
    public static void main(String[] args) {
        D ob = new D();
        System.out.println(ob.aa); // we can't write this line if the access-modifier of variable aa is private.
        ob.show(); // we can't write this line if the access-modifier of method is private.
    }
}
