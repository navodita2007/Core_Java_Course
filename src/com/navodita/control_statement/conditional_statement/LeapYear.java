package com.navodita.control_statement.conditional_statement;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;

        if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
