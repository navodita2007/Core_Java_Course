package com.navodita.control_statement.programs;

public class CheckPrimeNo2 {
    public static void main(String[] args) {
        int no = 13;

        boolean b = false;  // By-default value of boolean is false. Value of boolean can be taken true or false. Integer data-type can also be taken here.
        // int a = 0;    // This is by taking integer data-type.
        for (int i = 2; i < no; i++) {
            //    for (int i = 2; i < no/2; i++) {   // To find for larger number say, 30000000. If it is prime or not. This makes program more effective.

            if (no % i == 0) {
                b = true;
            }
        }
        if (b == true) {
            // if ( b )  {          // also we can just write, b , output will be same.
            System.out.println("Not prime");
        } else {
            System.out.println("No is prime");
        }
    }
}
