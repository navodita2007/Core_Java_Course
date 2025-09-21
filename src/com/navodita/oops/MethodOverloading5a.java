package com.navodita.oops;

class Picture2a {
    //void display(char a) {
    void display(int a) {
        System.out.println(a);
    }
}

public class MethodOverloading5a {
    public static void main(String[] args) {
        Picture2a p = new Picture2a();
        // p.display(1);
        p.display('d');
    }
}
/**
 * Rule : char gets promoted to int.
 * Rule : int type can not be promoted to char type.
 */