package com.navodita.control_statement.jump_statement;

public class ContinueDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue; // Continue keyword will skip the current iteration in the loop
            }
            System.out.println(i);

        }
    }
}
