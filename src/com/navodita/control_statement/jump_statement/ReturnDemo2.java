package com.navodita.control_statement.jump_statement;

public class ReturnDemo2 {
    public static void main(String[] args) {
        ReturnDemo2 ob = new ReturnDemo2();
        //  ob.m1(); // we can also store this into variable
        int i = ob.m1();
        System.out.println(i);
    }

    int m1() {

        return 10;
    }
}
// Since return type of method m1() is int, hence we must return integer value.