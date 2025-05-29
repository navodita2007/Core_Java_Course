package com.navodita.control_statement.programs;

public class CheckPrimeNo {
    public static void main(String[] args) {
        int no = 7;

        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                System.out.println("Not Prime");
            } else {
                System.out.println("No is prime");
            }
        }
    }
}
// Here we should not print the statements inside for loop because output will not be accurate.
// Here output is incorrect