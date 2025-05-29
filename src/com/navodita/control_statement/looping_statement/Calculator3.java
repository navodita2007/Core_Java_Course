package com.navodita.control_statement.looping_statement;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first No.");
        int no1 = s.nextInt(); // s is an object of Scanner class

        System.out.println("Enter second No.");
        int no2 = s.nextInt(); // s is an object of Scanner class

        System.out.println("Enter symbol (+,-,*,/)");
        String sym = s.next(); // s is an object of Scanner class

        switch (sym) {
            case "+":
                System.out.println(" Addition result is : " + (no1 + no2));
                break;
            case "-":
                System.out.println("Subtraction result is : " + (no1 - no2));
                break;
            case "*":
                System.out.println("Multiplication result is : " + (no1 * no2));
                break;
            case "/":
                System.out.println("Division result is : " + (no1 / no2));
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
