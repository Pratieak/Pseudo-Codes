package com.test.prateek;

public class Student {

    private String name;
    private int rollNumber;
    private int age;
    private int marks;

    public Student() {
    }

    public Student(String name, int rollNumber, int age, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n                name='" + name + '\'' +
                ",\n                rollNumber=" + rollNumber +
                ",\n                age=" + age +
                ",\n                marks=" + marks +
                '}'+"\n";
    }
}
