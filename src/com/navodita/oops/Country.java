package com.navodita.oops;

public class Country {
    void show1() {
        System.out.println("1");
    }
}

class State {
    void show1() {
        System.out.println("2");
    }
}
// class City extends Country, State{}  ->   Class cannot extend multiple classes

class City {

}

class MultipleInheritance {
    public static void main(String[] args) {
        City ob = new City();
        //  ob.show1();  compiler will confuse
    }
}

/* Why java does not support multiple inheritance?
If java had the feature of multiple inheritance, then method of which class compiler would have called...
Since methods have same name, then it would have been quite confusing for the compiler to call the right
method.In this situation an error will occur named as ambiguity error. That's why java doesn't support multiple inheritance.
**/