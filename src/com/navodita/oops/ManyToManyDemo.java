package com.navodita.oops;

class GraduationStudent {
    String rollno;
    String name;

    Languages[] lang; // Multiplle students are associated with multiple languages hence an array is made.

    GraduationStudent(String rollno1, String name1, Languages[] lang1) {
        rollno = rollno1;
        name = name1;
        lang = lang1;
    }

    void getStudentDetails() {
        System.out.println("Student RollNo : " + rollno);
        System.out.println("Student Name : " + name);
        System.out.println("Language Details");
        for (int i = 0; i < lang.length; i++) {
            // Language l = lang[i];
            System.out.println("Language Name : " + lang[i].langname + " and Language Code : " + lang[i].langcode);
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}


class Languages {
    String langcode;
    String langname;

    Languages(String langcode1, String langname1) {
        langcode = langcode1;
        langname = langname1;
    }
}

public class ManyToManyDemo {

    public static void main(String[] args) {
        Languages l1 = new Languages("java01", "java");
        Languages l2 = new Languages("py02", "python");
        Languages l3 = new Languages("cpp03", "C++");
        Languages[] lang = {l1, l2, l3};
        GraduationStudent s1 = new GraduationStudent("101", "deepak", lang);
        GraduationStudent s2 = new GraduationStudent("102", "deepesh", lang);
        GraduationStudent s3 = new GraduationStudent("103", "rahul", lang);
        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
    }
}
