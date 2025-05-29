package com.navodita.control_statement.conditional_statement;

// case 5 -> The syntax of "if" is " if(expression){} " , then expression should return boolean value.
// In expression, we can provide direct condition or we can also provide method calling statement which
// returns boolean value
public class IfDemo5 {
    public static void main(String[] args) {
        IfDemo5 ob = new IfDemo5();
        //ob.m1();
        if (ob.m1()) {
            System.out.println("hello");
        }
    }

    //  void m1() {
    boolean m1() {
        // System.out.println("hello");
        return true;
    }
}

