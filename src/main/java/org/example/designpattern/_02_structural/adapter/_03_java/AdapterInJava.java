package org.example.designpattern._02_structural.adapter._03_java;

import java.io.InputStream;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(list);
        ArrayList<String> list1 = Collections.list(enumeration);

    }
}
