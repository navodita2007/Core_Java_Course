package com.navodita.oops.polymorphism.method_overriding;

// ********* NOT METHOD OVERRIDING *********
class Apple1 {
    void show(int a) {
        System.out.println(a);
    }
}

class Box1 extends Apple1 {
    int show(String a) {
        System.out.println(a);
        return 0;

    }
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        Apple1 ob = new Box1();
        ob.show(10);
    }
}
