package org.example.designpattern._01_creational.factory_method._02_after;

import lombok.Data;
import org.example.designpattern._01_creational.abstract_factory._02_after.Anchor;
import org.example.designpattern._01_creational.abstract_factory._02_after.Wheel;

@Data
public class Ship {
    private String name;
    private String color;
    private String logo;
    private Wheel wheel;
    private Anchor anchor;
}
