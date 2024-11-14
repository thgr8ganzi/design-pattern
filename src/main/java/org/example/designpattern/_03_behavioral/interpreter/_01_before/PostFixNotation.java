package org.example.designpattern._03_behavioral.interpreter._01_before;

import java.util.Stack;

public class PostFixNotation {
    private final String expression;

    public PostFixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        PostFixNotation postFixNotation = new PostFixNotation("123+-");
        postFixNotation.calculate();
    }
    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
           switch (c) {
               case '+' -> numbers.push(numbers.pop() + numbers.pop());
               case '-' -> {
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                }
               default -> numbers.push(Integer.parseInt(c + ""));
           }
        }
        System.out.println(numbers.pop());
    }
}
