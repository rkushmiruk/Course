package com.romankushmiruk.gof.blinnov.behavioral.interpreter;

public class NonterminalExpressionNumber implements AbstractMathExpression {
    private int number;

    public NonterminalExpressionNumber(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context c) {
        c.pushValue(number);
    }
}
