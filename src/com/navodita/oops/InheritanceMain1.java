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
        System.out.println(ob.aa);
        ob.show();
    }
}
