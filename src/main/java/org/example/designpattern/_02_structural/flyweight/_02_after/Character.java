package org.example.designpattern._02_structural.flyweight._02_after;

import lombok.Data;

@Data
public class Character {
    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
