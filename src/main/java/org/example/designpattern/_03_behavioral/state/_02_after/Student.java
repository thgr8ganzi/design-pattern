package org.example.designpattern._03_behavioral.state._02_after;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    private Set<OnlineCourse> onlineCourses = new HashSet<>();

    public boolean isAvaliable(OnlineCourse onlineCourse) {
        return onlineCourses.contains(onlineCourse);
    }
    public void addPrivate(OnlineCourse onlineCourse) {
        onlineCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", onlineCourses=" + onlineCourses +
                '}';
    }
}