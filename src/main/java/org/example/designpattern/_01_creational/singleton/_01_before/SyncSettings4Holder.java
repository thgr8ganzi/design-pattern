package org.example.designpattern._01_creational.singleton._01_before;

import java.io.Serializable;

public class SyncSettings4Holder implements Serializable {
    private SyncSettings4Holder() {}

    private static class SettingsHolderHelper {
        private static final SyncSettings4Holder INSTANCE = new SyncSettings4Holder();
    }

    public static SyncSettings4Holder getInstance() {
        return SettingsHolderHelper.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
