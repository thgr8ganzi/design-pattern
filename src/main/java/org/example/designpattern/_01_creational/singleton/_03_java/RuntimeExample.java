package org.example.designpattern._01_creational.singleton._03_java;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
        runtime.gc();
        System.out.println(runtime);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);
        System.out.println(runtime == anotherInstance);
    }
}
