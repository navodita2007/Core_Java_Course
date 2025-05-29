package com.navodita.control_statement.jump_statement;

public class ReturnDemo10 {
    public static void main(String[] args) {
        ReturnDemo10 ob = new ReturnDemo10();
        ob.m1();
    }

    void m1() {
        //  return 10;     this will give error
        System.out.println("hi");
        return; // empty return statement can be provided in void return type method. But not in other return type methods like int, String

    }
}

// we can also avoid to write empty return statement in void return type method.