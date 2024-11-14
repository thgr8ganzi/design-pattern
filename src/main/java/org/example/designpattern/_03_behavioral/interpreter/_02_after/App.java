package org.example.designpattern._03_behavioral.interpreter._02_after;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        PostfixExpression postfixExpression = PostfixParser.parse("xyz+-");
        int result = postfixExpression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}
