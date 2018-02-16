package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        // example 7.1
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        // task 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("sample text", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("sample text", (text) -> text.toUpperCase());
        poemBeautifier.beautify("sample text", (text) -> text + text);
        poemBeautifier.beautify("sample text", (text) -> text.substring(6) + " " + text);
    }
}
