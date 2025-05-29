package com.navodita.control_statement.looping_statement;


import java.util.Scanner;

public class Calculator4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no1, no2;
        String sym, yn;

        do {

            System.out.println("Enter first No.");
            no1 = s.nextInt(); // s is an object of Scanner class

            System.out.println("Enter second No.");
            no2 = s.nextInt(); // s is an object of Scanner class

            System.out.println("Enter symbol (+,-,*,/)");
            sym = s.next(); // s is an object of Scanner class

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
            System.out.println("Do you want to continue (Press y for Yes or n for no)");
            yn = s.next();
            System.out.println("---------------------------------------------------------");
        }
        while (yn.equals("y") || yn.equals("Y"));


    }
}

