package com.navodita.control_statement.looping_statement;

public class WhileDemo3 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("hi");
        }
        // case -: If while loop is infinite and we provide any expression after while loop then it will provide
        //compile time error saying " unreachable statement " because compiler will not be able to reach that statement.
    }
}