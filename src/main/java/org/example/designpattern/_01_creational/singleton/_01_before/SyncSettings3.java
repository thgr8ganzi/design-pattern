package org.example.designpattern._01_creational.singleton._01_before;

public class SyncSettings3 {
    private SyncSettings3() {}

    private static volatile SyncSettings3 INSTANCE;

    public static SyncSettings3 getInstance() {
        if (INSTANCE == null) {
            synchronized (SyncSettings3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SyncSettings3();
                }
            }
        }
        return INSTANCE;
    }
}
