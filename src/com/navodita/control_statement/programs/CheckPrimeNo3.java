package com.navodita.control_statement.programs;

public class CheckPrimeNo3 {
    public static void main(String[] args) {
        int no = 11;

        int a = 0;    // This is by taking integer data-type. By-default value of integer is set to 0. Value of integer can be taken 1 or 0.

        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                a = 1;      // This is by taking integer data-type
            }
        }

        if (a == 1) {       // This is by taking integer data-type

            System.out.println("Not prime");
        } else {
            System.out.println("No is prime");
        }
    }
}
