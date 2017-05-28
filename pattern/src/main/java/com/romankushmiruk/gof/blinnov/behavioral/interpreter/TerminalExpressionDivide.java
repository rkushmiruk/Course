package com.romankushmiruk.gof.blinnov.behavioral.interpreter;

public class TerminalExpressionDivide implements AbstractMathExpression {

    @Override
    public void interpret(Context c) {
        c.pushValue((c.popValue() / c.popValue()));
    }
}