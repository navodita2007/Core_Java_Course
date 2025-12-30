package com.navodita.oops.polymorphism.method_overloading;

class Picture2 {
    void display(int a) {
        System.out.println(a);
    }
}

public class MethodOverloading5 {
    public static void main(String[] args) {
        Picture2 p = new Picture2();
        p.display('d');
        p.display(10);
    }
}
/**
 * Rule : char gets promoted to int. Hence, providing char value in argument will not create compile time error.But it's important to provide
 * int data-type in parameter.
 * int type can not be promoted to char type.
 */
// OUTPUT -> 100  (100 is the ASCII value of d)