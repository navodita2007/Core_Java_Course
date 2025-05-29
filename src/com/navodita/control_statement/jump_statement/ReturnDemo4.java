package com.navodita.control_statement.jump_statement;

public class ReturnDemo4 {
    public static void main(String[] args) {
        ReturnDemo4 ob = new ReturnDemo4();
        int i = ob.m1();
        System.out.println(i);
    }

    int m1() {
        int no1 = 10, no2 = 20;
        return no1 + no2;
    }
}
// Since return type of method m1() is int, hence we must return integer value.