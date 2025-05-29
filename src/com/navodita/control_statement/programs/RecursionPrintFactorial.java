package com.navodita.control_statement.programs;

// concept of "recursion"
public class RecursionPrintFactorial {
    public static void main(String[] args) {

        RecursionPrintFactorial ob = new RecursionPrintFactorial();
        ob.calcFact();

    }

    void calcFact() {
        System.out.println("hi");
        calcFact();   // Recursion
    }
}

// Recursion -> Recursion is when any method calls itself all the time.
// output will be : hi , infinite times , but at some point there will be error as : StackOverflowError