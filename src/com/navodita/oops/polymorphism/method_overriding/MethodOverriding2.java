package com.navodita.oops.polymorphism.method_overriding;

// ********* NOT METHOD OVERRIDING *********
class Apple {
    int show(int a) {
        System.out.println(a);
        return 0;
    }
}

class Box extends Apple {
    void show(String a) {
        System.out.println(a);
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Apple ob = new Box();
        ob.show(10);
    }
}
