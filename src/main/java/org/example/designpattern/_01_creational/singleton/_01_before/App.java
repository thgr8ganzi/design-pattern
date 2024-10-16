package org.example.designpattern._01_creational.singleton._01_before;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SyncSettings4Holder settings = SyncSettings4Holder.getInstance();
        SyncSettings4Holder settings2 = null;

        Constructor<SyncSettings4Holder> declaredConstructor = SyncSettings4Holder.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        SyncSettings4Holder settings1 = declaredConstructor.newInstance();

        System.out.println(settings == settings1);

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (SyncSettings4Holder) in.readObject();
        }
        System.out.println(settings == settings2);

    }
}
