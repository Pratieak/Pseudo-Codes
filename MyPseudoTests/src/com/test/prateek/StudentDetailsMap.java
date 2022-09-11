package com.test.prateek;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentDetailsMap {
    Map<String, Student> marksAbove80 = new TreeMap<>();
    Map<String, Student> ageAbove25 = new TreeMap<>();

    public void add(Student student) {
        if (student.getAge() > 25) {
            ageAbove25.put(student.getName(), student);
        }
        if (student.getMarks() > 80) {
            marksAbove80.put(student.getName(), student);
        }
    }

    public void addDetails(StudentDetailsMap details){
        ageAbove25.putAll(details.ageAbove25);
        marksAbove80.putAll(details.marksAbove80);
    }

    @Override
    public String toString() {
        return "StudentDetailsMap{" +
                "\nmarksAbove80=" + marksAbove80 +
                ", \n\n#######################################\nageAbove25=" + ageAbove25 +
                '}';
    }
}
