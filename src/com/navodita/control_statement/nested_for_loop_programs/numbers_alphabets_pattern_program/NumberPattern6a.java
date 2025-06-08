package com.navodita.control_statement.nested_for_loop_programs.numbers_alphabets_pattern_program;
// By using third variable
public class NumberPattern6a {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int k = 4;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k - 1;
            }
            System.out.println();
        }
    }
}
