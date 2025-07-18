package com.navodita.oops;

public class Nature {
    void rainbow() {
        //-----------------1000 lines of code------------------
        System.out.println("Rainbow has seven colors");
        //-----------------1000 lines of code------------------
    }
}
/* Code reusability ->It is a property of inheritance. We are able to reuse the 1000 lines of code into child
class/other part of program.Beacause of which speed of application will be greater/faster. Also, it will occupy lesser
memory.
 */

class Sky extends Nature {

}

class InheritanceMain {
    public static void main(String[] args) {
        Sky blue = new Sky();
        blue.rainbow();
    }
}
// Single inheritance program.