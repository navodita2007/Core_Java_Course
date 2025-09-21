package com.navodita.oops;

class Frame1 {
    void sum(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }

    void sum(float a, float b) {
        float res = a + b;
        System.out.println(res);
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Frame1 f = new Frame1();

        f.sum(10, 20);
        f.sum(10.4f, 20.7f);
    }
}

