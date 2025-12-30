package com.navodita.oops.polymorphism.method_overloading;

class Television1a {
    void display(int... a) {    // ... -> var args i.e., variable arguements. var args can take no argument or 1 argument or 2 argument.
        System.out.println(a);
    }
}

public class MethodOverloading7a {
    public static void main(String[] args) {
        Television1a t = new Television1a();
        t.display();
        t.display(10);
        t.display(20, 30);

    }
}
/**
 * [I@1b28cdfa  -> In the output object is getting printed. In the output, I is integer. 1b28cdfa is hexadecimal number.
 * [I@eed1f14 -> In the output object is getting printed. In the output, I is integer. eed1f14 is hexadecimal number.
 * [I@7229724f -> In the output object is getting printed. In the output, I is integer. 7229724f is hexadecimal number.
 */