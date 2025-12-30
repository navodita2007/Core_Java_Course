package com.navodita.oops.keyword;

// this-keyword is used to invoke the current class  method.
public class ThisDemo4 {
    void m1() {
        System.out.println("I am in m1 method");
        //  m2();   // this.m2();     compiler converts  m2();  into  this.m2();    because java is object-oriented. Any method is called using the object.
        this.m2();      // here this-keyword is used to invoke the current class method, because java is object-oriented. Any method is called using the object.
    }

    void m2() {
        System.out.println("I am in m2 method");
    }

    public static void main(String[] args) {
        ThisDemo4 ob = new ThisDemo4();
        ob.m1();
    }
}
