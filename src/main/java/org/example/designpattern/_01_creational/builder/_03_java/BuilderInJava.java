package org.example.designpattern._01_creational.builder._03_java;

import java.util.stream.Stream;

public class BuilderInJava {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String reulst = sb.append("Hello, ")
                .append("World!")
                .toString();
        System.out.println(reulst);

        StringBuilder sb2 = new StringBuilder();
        String result2 = sb2.append("Hello, ")
                .append("World!")
                .toString();
        System.out.println(result2);

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Hello")
                .add("World")
                .build();
        stream.forEach(System.out::println);

        Stream.Builder<String> builder2 = Stream.<String>builder()
                .add("Hello")
                .add("World");
        Stream<String> stream2 = builder2.build();

        LombokExample lombokExample = LombokExample.builder()
                .name("John")
                .age(30)
                .build();
        System.out.println(lombokExample);
    }
}
