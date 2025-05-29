package com.navodita.control_statement.programs;

// WAP to print factorial of the number
public class PrintFactorial {
    public static void main(String[] args) {
        int no = 5;
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + no + " is " + fact);
    }
}
