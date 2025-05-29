package com.navodita.control_statement.programs;

public class PrintFactorial3 {

    // WAP to print factorial of the number using "recursion" &
    // **** Using return keyword ****

    static int fact = 1;  // since we have static main method, so we can't just write instance variable. We have to write static keyword with instance variable.

    public static void main(String[] args) {
        int no = 5;

        PrintFactorial3 ob = new PrintFactorial3();
        int res = ob.calcFact(no);

        System.out.println("Factorial of " + no + " is " + res); // doing with return keyword

    }

    int calcFact(int no) {     // instance method
        if (no >= 1) {
            fact = fact * no; // we can use instance variable 'fact' here since we have made it static.
            no = no - 1;
            calcFact(no);   // Recursion

        }
        return fact;
    }
}



