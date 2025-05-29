package com.navodita.control_statement.jump_statement;

public class ReturnDemo7 {
    public static void main(String[] args) {
        ReturnDemo7 ob = new ReturnDemo7();
        System.out.println(ob.m1());
        // System.out.println(ob.m2());              error ->  'void' type not allowed here
        ob.m2();        // we can call method with return type as void
    }

    int m1() {
        return 10;
    }

    void m2() {
        System.out.println("hi");
    }
}
