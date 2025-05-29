package com.navodita.control_statement.star_pattern_programs;

public class NestedForLoop3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("i : " + i);
            // outer for loop will execute for total 3 times because i<=3
            for (int j = 1; j <= i; j++) {
                System.out.println("j : " + j);
                // inner for loop will execute for total 6 times. First when i=1, 1 times; second when i=2, 2 times; third when i=3, 3 times.
            }
        }
    }
}
