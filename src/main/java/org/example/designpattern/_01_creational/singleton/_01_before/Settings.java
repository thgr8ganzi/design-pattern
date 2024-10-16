package org.example.designpattern._01_creational.singleton._01_before;

import java.io.Serializable;

public class Settings implements Serializable {
    private Settings() {}

    private static Settings INSTANCE;

    public static Settings getInstance() {
        if (INSTANCE == null) {
            return new Settings();
        }
        return INSTANCE;
    }
}
