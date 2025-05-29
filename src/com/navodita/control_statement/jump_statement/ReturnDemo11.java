package com.navodita.control_statement.jump_statement;

public class ReturnDemo11 {
    public static void main(String[] args) {
        ReturnDemo11 ob = new ReturnDemo11();
        int i = ob.m1();
        System.out.println(i);
    }

    int m1() {
        System.out.println("hi");
        return 10;
        //   System.out.println("hello");    // error -> Unreachable statement
    }
}


// Return statement must be the last statement in case of returned method
// We should not write any statement after return statement otherwise it will give "unreachable statement" error