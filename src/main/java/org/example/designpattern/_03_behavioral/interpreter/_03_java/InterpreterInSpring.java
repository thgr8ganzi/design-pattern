package org.example.designpattern._03_behavioral.interpreter._03_java;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class InterpreterInSpring {
    public static void main(String[] args) {
        Book book = new Book("spring");
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("title");
        System.out.println(expression.getValue(book));
    }
}
