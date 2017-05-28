package com.romankushmiruk.gof.blinnov.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Scanner;


public class Client {
    private ArrayList<AbstractMathExpression> listExpression;

    public Client(String expression) {
        listExpression = new ArrayList<>();
        parse(expression);
    }

    private void parse(String expression) {
        for (String lexeme : expression.split("\\p{Blank}+")) {
            if (lexeme.isEmpty()) {
                continue;
            }
            char temp = lexeme.charAt(0);
            switch (temp) {
                case '+':
                    listExpression.add(new TerimnalExpressionPlus());
                    break;
                case '-':
                    listExpression.add(new TerimnalExpressionMinus());
                    break;
                case '*':
                    listExpression.add(new TerimnalExpressionMultiply());
                    break;
                case '/':
                    listExpression.add(new TerminalExpressionDivide());
                    break;
                default:
                    Scanner scan = new Scanner(lexeme);
                    if (scan.hasNextInt()) {
                        listExpression.add(
                                new NonterminalExpressionNumber(scan.nextInt()));
                    }
            }
        }
    }

    public Number calculate() {
        Context context = new Context();
        // выполнение простых задач и сборка результата
        for (AbstractMathExpression terminal : listExpression) {
            terminal.interpret(context);
        }
        return context.popValue();
    }
}