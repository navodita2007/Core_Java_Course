package com.navodita.control_statement.programs;
// WAP to print factorial of the number using recursion

public class PrintFactorial2 {
    static int fact = 1;  // since we have static main method, so we can't just write instance variable. We have to write static keyword with instance variable.

    public static void main(String[] args) {
        int no = 5;

        PrintFactorial2 ob = new PrintFactorial2();
        ob.calcFact(no);

        System.out.println("Factorial of " + no + " is " + fact); // Since main method is static, we have to write static keyword with instance variable 'fact' so that we can use the variable 'fact' inside main method and also inside instance method.

    }

    void calcFact(int no) {     // instance method
        if (no >= 1) {
            fact = fact * no; // we can use instance variable 'fact' here since we have made it static.
            no = no - 1;
            calcFact(no);   // Recursion

        }
    }
}

