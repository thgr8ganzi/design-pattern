package org.example.designpattern._03_behavioral.interpreter._02_after;

import java.util.Stack;

public class PostfixParser {
    // TODO xyz+- => z - (x + y)
    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+' -> {
                return PostfixExpression.plus(stack.pop(), stack.pop());
            }
            case '-' -> {
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return PostfixExpression.minus(left, right);
            }
            case '*' -> {
                return PostfixExpression.multiply(stack.pop(), stack.pop());
            }
            default -> {
                return PostfixExpression.variable(c);
            }
        }
    }
}
