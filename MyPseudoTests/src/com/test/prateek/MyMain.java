package com.test.prateek;

import java.util.ArrayList;
import java.util.List;

public class MyMain {

    public static void main(String[] args){
        Student s1 = new Student("Amit", 1, 21, 71);
        Student s2 = new Student("Anoop", 2, 22, 82);
        Student s3 = new Student("Anurag", 3, 23, 77);
        Student s4 = new Student("Mayank", 4, 21, 93);
        Student s5 = new Student("Rahul", 5, 22, 88);
        Student s6 = new Student("Rohit", 6, 23, 98);
        Student s7 = new Student("Shobhit", 7, 28, 71);
        Student s8 = new Student("Prateek", 8, 18, 82);
        Student s9 = new Student("Harshal", 9, 32, 83);
        Student s10 = new Student("Kundan", 10, 27, 93);
        Student s11 = new Student("Kunal", 11, 31, 88);
        Student s12 = new Student("Sumit", 12, 19, 98);
        Student s13 = new Student("Kunal", 13, 31, 88);
        List<Student> studentList = List.of(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13);
        StudentDetailsMap detailsMap = studentList.stream().collect(StudentDetailsMap::new, StudentDetailsMap::add, StudentDetailsMap::addDetails);
        System.out.println("Inside main blocks: Student details = "+ detailsMap);
    }

}
