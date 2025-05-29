package com.navodita.control_statement.jump_statement;

public class BreakDemo4 {
    public static void main(String[] args) {
        outer:
        // any name can be provided to loop. Here name is outer.
        for (int i = 1; i <= 3; i++) {
            System.out.println("i : " + i);

            //  any name can be provided to loop. Here name is inner.
            inner:
            for (int j = 1; j <= 3; j++) {
                System.out.println("j : " + j);
                if (j == 2) {
                    break outer; // this break statement will break the outer for-loop
                }
            }
        }
    }
}
// : -> It is a punctuator. It is used after loop labels.