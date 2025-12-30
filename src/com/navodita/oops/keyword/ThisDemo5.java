package com.navodita.oops.keyword;

// constructor
public class ThisDemo5 {
    ThisDemo5() {
        System.out.println("1");
    }

    ThisDemo5(int no) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        ThisDemo5 ob1 = new ThisDemo5();
        ThisDemo5 ob2 = new ThisDemo5(10);
    }
}
