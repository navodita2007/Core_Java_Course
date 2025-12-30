package com.navodita.oops.keyword;

public class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {          // same as below but, by using this keyword.
        this.rollno = rollno;
        this.name = name;
    }
//        Student(int rollno1, String name1) {              // same as above
//            rollno = rollno1;
//            name = name1;
//        }

    void show() {
        System.out.println("Student Rollno : " + rollno);
        System.out.println("Student Name : " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Navodita");
        s1.show();
    }
}
