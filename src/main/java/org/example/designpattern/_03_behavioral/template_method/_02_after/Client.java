package org.example.designpattern._03_behavioral.template_method._02_after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process((sum, number) -> sum += number);
        System.out.println("Result: " + result);
    }
}
