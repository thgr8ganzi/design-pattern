package org.example.designpattern._01_creational.prototype._03_java;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class PrototypeInJava {
    public static void main(String[] args) {
        Student student = new Student("John");
        Student student2 = new Student("John2");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(students == clone);
        System.out.println(students.equals(clone));

        System.out.println("================");
        ModelMapper modelMapper = new ModelMapper();
        List<Student> students2 = modelMapper.map(students, List.class);
        System.out.println(students == students2);
        System.out.println(students.equals(students2));
    }
}
