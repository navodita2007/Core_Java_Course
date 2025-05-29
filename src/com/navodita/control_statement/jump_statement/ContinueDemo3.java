package com.navodita.control_statement.jump_statement;

public class ContinueDemo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                System.out.println(i);

                continue; // Continue keyword will skip the current iteration in the loop
                //    System.out.println(i);         compile time error -> Unreachable statement

            }

        }
    }
}
