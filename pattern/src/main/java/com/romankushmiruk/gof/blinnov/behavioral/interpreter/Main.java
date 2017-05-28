package com.romankushmiruk.gof.blinnov.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        String expression = "3 2 9 4 / * -"; // expression in polska form
        Client interpreter = new Client(expression);
        System.out.println("[ " + expression + " ] = " + interpreter.calculate());
    }
}
