package com.navodita.control_statement.nested_for_loop_programs.numbers_alphabets_pattern_program;

public class AlphabetPattern1 {
    public static void main(String[] args) {
        int count = 64;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (count + j) + " ");  // type-cast the int data-type into char data-type
                // or, System.out.print((char) (count + i) + " ");
                // or,  System.out.print((char) count + " ");
                //   count = count + 1;
            }
            System.out.println();
        }
    }
}
