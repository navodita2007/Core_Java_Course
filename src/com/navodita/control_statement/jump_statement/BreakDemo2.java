package com.navodita.control_statement.jump_statement;

// Whenever we use break statement, then loop gets terminated without checking the condition and first statement
// after the loop will be executed.

public class BreakDemo2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                System.out.println(i);

                break;
                //  System.out.println("hi");         //  error ->  Unreachable statement
                // There should not be any statement just after the break statement
            }
            System.out.println("hi");
        }
        System.out.println("hello");
    }
}
