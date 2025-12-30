package com.navodita.oops.keyword;

// ************ this -:keyword  **************
// this keyword is "reference variable" that refers to the current object.
public class ThisDemo1 {
    void m1() {
        System.out.println("I am in m1 method : " + this);
    }

    public static void main(String[] args) {
        ThisDemo1 ob = new ThisDemo1();
        System.out.println("I am in main method : " + ob);// output -:ThisDemo1@65ab7765 basically output format will be ClassName@HexadecimalValue
        //  System.out.println(this);  // this keyword is not directly used inside main method.
        ob.m1();
    }
}
/*
    OUTPUT -:
        I am in main method : com.navodita.oops.keyword.ThisDemo1@4c873330
        I am in m1 method : com.navodita.oops.keyword.ThisDemo1@4c873330
* */

/*
this( keyword) and ob (object reference or reference variable) refers to the same object. That's why output are same in case of this
keyword and ob(reference variable or object reference). this keyword is also known as reference variable.
* */