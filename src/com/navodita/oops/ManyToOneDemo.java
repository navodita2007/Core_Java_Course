package com.navodita.oops;

class UniversityStudent {
    String rollno;
    String name;

    Branch branch;

    UniversityStudent(String rollno1, String name1, Branch branch1) {
        rollno = rollno1;
        name = name1;
        branch = branch1;
    }

    void getStudentDetails() {
        System.out.println("Student Rollno : " + rollno);
        System.out.println("Student Name : " + name);
        System.out.println("Student Branch Code : " + branch.branchcode);
        System.out.println("Student Branch Name : " + branch.branchname);
        System.out.println("-------------------------------------------------------");
    }
}

class Branch {
    String branchcode;
    String branchname;

    Branch(String branchcode1, String branchname1) {
        branchcode = branchcode1;
        branchname = branchname1;
    }
}

class ManyToOneDemo {
    public static void main(String[] args) {
        Branch b1 = new Branch("cse01", "CSE");
        UniversityStudent s1 = new UniversityStudent("101", "deepak", b1);
        UniversityStudent s2 = new UniversityStudent("102", "deepesh", b1);
        UniversityStudent s3 = new UniversityStudent("103", "amit", b1);

        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
    }
}