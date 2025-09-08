package com.navodita.oops;
//   ***** ONE-TO-ONE ASSOCIATION *****

class Person {
    String name;
    String city;
    Passport pass;  // pass is the reference of Passport (class)

    Person(String name1, String city1, Passport pass1) {
        name = name1;
        city = city1;
        pass = pass1;

    }

    void showPersonDetails() {
        System.out.println("Name : " + name);
        System.out.println("City : " + city);
        System.out.println("Passport Details");
        System.out.println("passport Number : " + pass.number);
        System.out.println("passport Number : " + pass.validity);
        System.out.println("--------------------------------------------------");

    }

}

class Passport {
    String number;
    String validity;

    Passport(String number1, String validity1) {
        number = number1;
        validity = validity1;
    }
}

public class OneToOneDemo2 {
    public static void main(String[] args) {
        Passport pass1 = new Passport("12345", "01-01-2030");
        Person p1 = new Person("Deepak", "chandigarh", pass1);
        p1.showPersonDetails();

        Passport pass2 = new Passport("456789", "09-12-2035");
        Person p2 = new Person("Deepesh", "ranchi", pass2);
        p2.showPersonDetails();
    }
}
