package org.example.designpattern._02_structural.flyweight._02_after;

import lombok.Getter;

@Getter
public final class Font {
    private final String fontFamily;
    private final int fontSize;

    public Font(String fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
