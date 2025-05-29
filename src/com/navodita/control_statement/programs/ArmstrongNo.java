package com.navodita.control_statement.programs;

public class ArmstrongNo {
    public static void main(String[] args) {
        int no = 153;    // (1*1*1) + (5*5*5) + (3*3*3)

        int temp1 = no; // to keep the value of no safe , we store it in another variable temp1
        int leng = 0;
        while (temp1 != 0) {
            leng = leng + 1;
            temp1 = temp1 / 10;
        }
        // System.out.println(leng);    // To find the length of number, we can s.o.p(leng)

        int temp2 = no;
        int rem;
        int sum = 0;

        while (temp2 != 0) {
            rem = temp2 % 10;
            // System.out.println(rem);    // To get individual numbers, we can s.o.p(rem)
            temp2 = temp2 / 10;

            int mul = 1;

            for (int i = 1; i <= leng; i++) {
                mul = mul * rem;
            }
            // System.out.println(mul);    // To find multiplication as per length of each digits individually

            sum = sum + mul;
        }
        if (no == sum) {
            System.out.println(no + " is armstrong number");
        } else {
            System.out.println(no + " is not an armstrong number");
        }

    }
}
