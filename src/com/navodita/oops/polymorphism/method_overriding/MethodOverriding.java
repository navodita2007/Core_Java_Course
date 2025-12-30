package com.navodita.oops.polymorphism.method_overriding;
// Method Overriding
/*
RULES OF METHOD OVERRIDING -:
1> same name of 2 or more methods.
2> both methods are present within different class.
3> same parameters-:
    a> same no. of parameters.
    b> same type of parameters.
    c> same sequence of parameters.
4> IS.A Relationship should also be present.
*/

class A {
    void show1() {
        System.out.println("1");
    }
}

class B extends A {
    void show2() {
        System.out.println("2");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.show1();

        B ob2 = new B();
        ob2.show2();

        A ob3 = new B(); // Because B class is the child class of A class, we can make an object of B class and put in the reference of A class.
        ob3.show1();
        // ob3.show2();
    }
}
