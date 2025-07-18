package com.navodita.oops;

class Hierarchy {
    void show1() {
        System.out.println("I am in the train");
    }

}

class SystemImpl extends Hierarchy {
    void show2() {
        System.out.println("I am in the bus");
    }
}

class Parliament extends Hierarchy {
    void show3() {
        System.out.println("I am in the flight");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Hierarchy ob1 = new Hierarchy();
        ob1.show1();

        SystemImpl ob2 = new SystemImpl();
        ob2.show2();
        ob2.show1();

        Parliament ob3 = new Parliament();
        ob3.show3();
        ob3.show1();
    }
}
