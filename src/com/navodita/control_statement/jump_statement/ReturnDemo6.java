package com.navodita.control_statement.jump_statement;

public class ReturnDemo6 {
    public static void main(String[] args) {
        ReturnDemo6 ob = new ReturnDemo6();
        System.out.println(ob.m1());
        //  System.out.println(ob.m2());              error ->  'void' type not allowed here
        ob.m2();        // we can call method with return type as void
    }

    int m1() {
        return 10;
    }

    void m2() {

    }
}
