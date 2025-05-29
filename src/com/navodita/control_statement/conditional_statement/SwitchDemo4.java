package com.navodita.control_statement.conditional_statement;

public class SwitchDemo4 {
    public static void main(String[] args) {
        String name = "deepak";

        final String name1 = "amit";
        // String name1 = "amit";    // error: constant string expression required
        final String name2 = "deepesh";
        // String name2 = "deepesh";    // error: constant string expression required
        final String name3 = "deepak";
        // String name3 = "deepak";    // error: constant string expression required
        final String name4 = "rahul";
        // String name4 = "rahul";    // error: constant string expression required


        switch (name) {
            case name1:
                System.out.println("101");
            case name2:
                System.out.println("102");
            case name3:
                System.out.println("103");
            case name4:
                System.out.println("104");
            default:
                System.out.println("Invalid name");
        }
    }
}