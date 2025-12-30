package com.navodita.oops.abstraction;

// Interface using default-method
interface I4 {
    default void show() {
        System.out.println("I am default method");
    }
}

class Test implements I4 {

}

public class InterfaceNewFeatures1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}
/* Features of default-method -: we can create default-method inside interface. Because of default-method, other classes are not
 * disturbed.It is a rule to create only abstract method inside interface. Abstract method needs to be implemented in all other
 * classes, doing which it can disturb the other classes. So to avoid disturbance we can create default-method in an interface.
 * default method has its body.*/