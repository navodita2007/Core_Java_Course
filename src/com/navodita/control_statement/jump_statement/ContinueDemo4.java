package com.navodita.control_statement.jump_statement;

public class ContinueDemo4 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 3; j++) {
                if (i == 2) {
                    continue outer;  // Labelled continue statement
                }
                System.out.println(i);
            }

        }
    }
}