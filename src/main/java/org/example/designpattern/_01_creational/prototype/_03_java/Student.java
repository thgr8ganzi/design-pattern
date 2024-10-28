package org.example.designpattern._01_creational.prototype._03_java;

import lombok.Data;

@Data
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
