package org.example.designpattern._03_behavioral.interpreter._03_java;

import java.util.regex.Pattern;

public class InterpreterInJava {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".pr...", "spring"));
        System.out.println(Pattern.matches("[a-z]{6}", "spring"));
        System.out.println(Pattern.matches("white[a-z]{4}[0-9]{4}", "whitesnow1234"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "a"));
    }
}
