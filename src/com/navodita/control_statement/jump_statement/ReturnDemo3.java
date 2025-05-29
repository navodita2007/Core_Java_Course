package com.navodita.control_statement.jump_statement;

public class ReturnDemo3 {
    public static void main(String[] args) {
        ReturnDemo3 ob = new ReturnDemo3();
        String s = ob.m1(); // The moment we call the method m1() , at that moment string value will be returned
        System.out.println(s);
    }

    String m1() {

        return "Bhupendra";
    }
}
// Since return type of method m1() is String, hence we must return String value.