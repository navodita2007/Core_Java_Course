package com.navodita.control_statement.nested_for_loop_programs.numbers_alphabets_pattern_program;

public class NumberPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
