package com.navodita.control_statement.nested_for_loop_programs.numbers_alphabets_pattern_program;

public class NumberPattern8b {
    public static void main(String[] args) {
        int count = 1, e = 0;
        for (int i = 1; i <= 4; i++) {
            e = count + 3;
            for (int j = 1; j <= 4; j++) {

                if (i % 2 == 0) {
                    System.out.print(e + " ");
                    e = e - 1;
                } else {
                    System.out.print(count + " ");
                }
                count = count + 1;

                // System.out.println("e :" + e);   -> to know the last value of e
            }
            System.out.println();
        }
    }
}
