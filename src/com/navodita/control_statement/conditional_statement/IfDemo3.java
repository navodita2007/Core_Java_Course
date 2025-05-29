package com.navodita.control_statement.conditional_statement;

public class IfDemo3 {
    public static void main(String[] args) {
        {
            int no1 = 10;
            int no2 = 20;
            if (no1 > no2)
                System.out.println("no1 is greater");
                // System.out.println("hello");  -> error: 'else' without 'if'
            else
                System.out.println("no2 is greater");
            // System.out.println("hi");  -> error : 'else' without 'if'
        }
    }
}
// case 1 : If there is only single statement in if or else then it's not compulsory to use curly braces {}.