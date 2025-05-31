package com.navodita.control_statement.nested_for_loop_programs.star_pattern_programs;

public class StarPattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                //  for (int j = 5; j >= i; j++) {           -> This will give infinity stars in the output
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
