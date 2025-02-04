package org.example.designpattern._03_behavioral.visitor._01_middle;

public interface Shape {
    void printTo(Phone phone);
    void printTo(Watch watch);
}
