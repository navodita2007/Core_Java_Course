package com.navodita.control_statement.nested_for_loop_programs.numbers_alphabets_pattern_program;

public class NumberPattern8a {
    public static void main(String[] args) {
        int count = 1, e = 0;
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                e = e + 3;
                //  System.out.println("e1 : " + e);    -> to understand the flow of values
                for (int j = 1; j <= 4; j++) {
                    System.out.print(e + " ");
                    e = e - 1;
                    count = count + 1;
                }
            } else {
                for (int j = 1; j <= 4; j++) {
                    System.out.print(count + " ");
                    count = count + 1;
                }
                e = count;
                //  System.out.println("e2 : " + e);    -> to understand the flow of values
            }
            System.out.println();
        }
    }
}
