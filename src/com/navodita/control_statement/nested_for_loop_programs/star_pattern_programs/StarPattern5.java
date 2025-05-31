package com.navodita.control_statement.nested_for_loop_programs.star_pattern_programs;

public class StarPattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("_");
                // System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
