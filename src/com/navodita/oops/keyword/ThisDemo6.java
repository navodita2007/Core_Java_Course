package com.navodita.oops.keyword;

public class ThisDemo6 {
    ThisDemo6() {
        System.out.println("1");
    }

    ThisDemo6(int no) {
        this();
        System.out.println("2");
    }

    public static void main(String[] args) {
        ThisDemo6 ob2 = new ThisDemo6(10);
    }
}
