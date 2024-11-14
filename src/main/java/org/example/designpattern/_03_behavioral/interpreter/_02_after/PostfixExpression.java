package org.example.designpattern._03_behavioral.interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);

    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }
    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }
    static PostfixExpression variable(Character variable) {
        return context -> context.get(variable);
    }
    static PostfixExpression multiply(PostfixExpression pop, PostfixExpression pop1) {
        return context -> pop.interpret(context) * pop1.interpret(context);
    }
}
