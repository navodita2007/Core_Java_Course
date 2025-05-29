package com.navodita.control_statement.programs;

// WAP to check for palindrome number
public class PalindromeNumber {
    public static void main(String[] args) {
        int no = 12321;
        int temp = no;
        int rem, rev = 0;

        // Use the concept of "reversing a number" inside the while loop
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem; // The moment we use the variable in some expression, then we should have already assigned/initialised it, here rev=0
            temp = temp / 10;
        }
        System.out.println("no : " + no);

        System.out.println("rev : " + rev);
        if (no == rev) {
            System.out.println("No is palindrome number");
        } else {
            System.out.println("No is not palindrome number");
        }
    }
}
