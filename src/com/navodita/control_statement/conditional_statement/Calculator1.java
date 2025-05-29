package com.navodita.control_statement.conditional_statement;

public class Calculator1 {
    public static void main(String[] args) {
        int no1 = 10, no2 = 20;
        char c = '*';

        switch (c) {
            case '+':
                System.out.println(" Addition result is : " + (no1 + no2));
                break;
            case '-':
                System.out.println("Subtraction result is : " + (no1 - no2));
                break;
            case '*':
                System.out.println("Multiplication result is : " + (no1 * no2));
                break;
            case '/':
                System.out.println("Division result is : " + (no1 / no2));
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
