package com.navodita.control_statement.nested_for_loop_programs.numbers_alphabets_pattern_program;

public class NumberPattern3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {   // outer for-loop is for row
            for (int j = 1; j <= i; j++) {  // inner for-loop is for column
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
