package com.navodita.oops;

class G {
    void show1() {
        System.out.println("I am in class G");
    }
}

class H extends G {
    void show2() {
        System.out.println("I am in class H");
    }
}

class I extends H {
    void show3() {
        System.out.println("I am in class I");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        G ob1 = new G();
        ob1.show1();
        //   ob1.show2();  Can not write like this because parent class G can't inherit child class H
        //   ob1.show3();   Can not write like this because parent class G can't inherit child class I

        H ob2 = new H();
        ob2.show2();
        ob2.show1();
        //   ob2.show3();    Can not write like this because parent class H can't inherit child class I

        I ob3 = new I();
        ob3.show3();
        ob3.show2();
        ob3.show1();
    }
}
// Code regarding multi-level inheritance