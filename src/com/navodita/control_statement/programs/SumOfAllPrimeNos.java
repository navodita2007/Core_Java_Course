package com.navodita.control_statement.programs;

// WAP to print the sum of all prime numbers between 1-100

public class SumOfAllPrimeNos {
    public static void main(String[] args) {
        int sum = 0;
        for (int no = 2; no <= 100; no++) {

            boolean b = false;

            for (int i = 2; i < no / 2; i++) {
                if (no % i == 0) {
                    b = true;
                }
            }
            if (b == false) {
                sum = sum + no;
            }
        }
        System.out.println(sum);
    }
}
// output -> 1064