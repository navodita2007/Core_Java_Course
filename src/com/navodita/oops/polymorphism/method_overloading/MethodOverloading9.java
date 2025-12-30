package com.navodita.oops.polymorphism.method_overloading;

class Movi {
    void display(Object a) {
        System.out.println("1");
    }

    void display(String a) {
        System.out.println("2");
    }

    void display(StringBuilder a) {
        System.out.println("3");
    }
}

public class MethodOverloading9 {
    public static void main(String[] args) {
        Movi m = new Movi();
        m.display("Deepak"); // Providing null as an argument will give ambiguity error because compiler is getting confused as String class, StringBuffer class and StringBuilder class are at same level.
        //  m.display(null);  -> It will give error.
        m.display(new StringBuilder("Amit"));
        Object o = new Object();
        m.display(o);
        // m.display(new Object());
    }
}
