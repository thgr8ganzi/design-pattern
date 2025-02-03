package org.example.designpattern._03_behavioral.template_method._01_before;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int sum = fileProcessor.process();
        System.out.println("Sum: " + sum);
    }
}
