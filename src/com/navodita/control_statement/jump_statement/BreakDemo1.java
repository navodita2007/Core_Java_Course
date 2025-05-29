package com.navodita.control_statement.jump_statement;

public class BreakDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
            }
        }
        System.out.println("hello");
    }
}
