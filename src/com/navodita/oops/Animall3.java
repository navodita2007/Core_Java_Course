package com.navodita.oops;

public class Animall3 {
    int age;      // 4 byte
    int legs;     // 4 byte
}

class AnimalMain {
    public static void main(String[] args) {
        Animall3 buzo = new Animall3();
        System.out.println(buzo);   // output-> com.navodita.oops.Animall3@1b28cdfa  :- 1b28cdfa is the hexadecimal value
        System.out.println(buzo.hashCode());   // output-> 455659002  :- Hashcode value(Unique integer value)

        System.out.println("-------------------------------------");

        Animall3 cat = new Animall3();
        System.out.println(cat);   // output-> com.navodita.oops.Animall3@eed1f14  :- eed1f14 is the hexadecimal value
        System.out.println(cat.hashCode());   // output-> 250421012  :- Hashcode value(Unique integer value)
    }
}
