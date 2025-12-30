package com.navodita.oops.keyword;

public class ThisDemo2 {
    int no = 10;

    void m1(int no) {
        System.out.println(no);    // output -> 20
        System.out.println(this.no);    // output -> 10 (because this-keyword points toward the instance variable of current class)
    }

    public static void main(String[] args) {
        ThisDemo2 ob = new ThisDemo2();
        ob.m1(20);
        System.out.println(ob.no);      // output -> 10
    }
}
// this-keyword is a reference variable.
// System.out.println(this.no); & System.out.println(ob.no); act in same way.