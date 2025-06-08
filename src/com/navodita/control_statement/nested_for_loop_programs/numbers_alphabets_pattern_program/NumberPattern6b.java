package com.navodita.control_statement.nested_for_loop_programs.numbers_alphabets_pattern_program;

// By using third variable
public class NumberPattern6b {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
