package com.navodita.oops.keyword;

public class ThisDemo7 {
    ThisDemo7() {
        this(10);
        System.out.println("1");
    }

    ThisDemo7(int no) {
        System.out.println(no);
    }

    public static void main(String[] args) {
        ThisDemo7 ob2 = new ThisDemo7();
    }

}
