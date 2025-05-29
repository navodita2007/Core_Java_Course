package com.navodita.control_statement.looping_statement;

import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Through Scanner class we take input from user

        System.out.println("Enter your name");
        String name = s.next(); // Through next() method string value is get from user
        System.out.println("Your name is : " + name);

        System.out.println("-----------------------------------------------");


        System.out.println("Enter your pin no");
        int pinno = s.nextInt(); // Through nextInt() method integer value is get from user.
        System.out.println("Your pin is : " + pinno);

    }
}


