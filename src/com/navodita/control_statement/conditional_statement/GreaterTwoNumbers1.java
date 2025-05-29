// WAP to find the greater number between 2 numbers using ternary operator
// ternary operator -> ?: (variable = condition ? expression1 : expression2 )

package com.navodita.control_statement.conditional_statement;

public class GreaterTwoNumbers1 {
    public static void main(String[] args) {
        int no1 = 100;
        int no2 = 20;
        int res = (no1 > no2) ? no1 : no2;
        System.out.println(res + " is greater");
    }
}