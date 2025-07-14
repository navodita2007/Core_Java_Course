package com.navodita.oops;

class A {                // class A is a Parent class. By default, Parent class A directly inherits object class.
    void show1() {
        System.out.println("I am in class A");
    }
}

class B extends A {          // class B is a child class.
    void show2() {
        System.out.println("I am in class B");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.show1();
        // ob1.show2();    -> Can not write like this because parent class can't inherit the properties of child class.

        B ob2 = new B();
        ob2.show2();
        ob2.show1();
    }
}
/* In single inheritance child class will get/inherit all the properties of parent class. */
/* By default, any class in java directly or indirectly inherits the object class. Any Parent class directly inherits
the object class. Any child class indirectly inherits the object class.
 */