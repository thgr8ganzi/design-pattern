package org.example.designpattern._01_creational.singleton._01_before;

public class SyncSettings2 {
    private SyncSettings2() {}

    private static final SyncSettings2 INSTANCE = new SyncSettings2();

    public static SyncSettings2 getInstance() {
        return INSTANCE;
    }
}
