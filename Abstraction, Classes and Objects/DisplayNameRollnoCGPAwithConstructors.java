package com.company;

public class DisplayNameRollnoCGPAwithConstructors {
    public static void main(String[] args) {
        Student s1 = new Student (1056 , "karan",8.8);
        s1.displayProfile();
        System.out.println(s1.findPercentage());
    }
}

class Student {
    public int rollno;
    public String name;
    public double cgpa;

    public Student(int rollno, String name,double cgpa)
    {
        this.rollno = rollno ;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}


