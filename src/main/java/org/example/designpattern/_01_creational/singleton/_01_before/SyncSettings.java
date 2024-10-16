package org.example.designpattern._01_creational.singleton._01_before;

public class SyncSettings {
    private SyncSettings() {}

    private static SyncSettings INSTANCE;

    public static synchronized SyncSettings getInstance() {
        if (INSTANCE == null) {
            return new SyncSettings();
        }
        return INSTANCE;
    }
}
