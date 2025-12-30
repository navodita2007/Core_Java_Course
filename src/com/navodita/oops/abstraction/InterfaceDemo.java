package com.navodita.oops.abstraction;

interface Vehicle1 {
    void start();

    void noOfGears(int a);
}

abstract class Bus implements Vehicle1 {
    int gears;

    public void start() {
        System.out.println("Bus starts with key");
    }

//    public void noOfGears(int gears1) {
//        gears = gears1;
//        System.out.println("Bus is running on gear : " + gears);
//
//    }
}

class Car1 implements Vehicle1 {
    int gears;

    public void start() {
        System.out.println("Car starts with key");
    }

    public void noOfGears(int gears1) {
        gears = gears1;
        System.out.println("Car is running on gear : " + gears);

    }
}

class Scooter1 implements Vehicle1 {
    int gears;

    public void start() {
        System.out.println("Scooter starts with kick");
    }

    public void noOfGears(int gears1) {
        gears = gears1;
        System.out.println("Scooter is running on gear : " + gears);
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        // Vehicle1 v=new Vehicle1() {       // -> we can not create object of an interface.
//        Bus b = new Bus();   // -> we can not create an object of abstract class
//        b.start();
//        b.noOfGears(6);
        Car1 c = new Car1();
        c.start();
        c.noOfGears(4);
    }
}

// note-: we cant create an object of interfaces and abstract classes because they contain abstract methods.
// abstract methods don't have body. calling them via object-name is anyway not useful.