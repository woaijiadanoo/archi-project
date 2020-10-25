package com.sishuok.jiangzh.archi.designs.interpreter.demo.v2;

public class MarryAndTerminalExpression extends MarryInterpreter{

    public MarryAndTerminalExpression(MarryInterpreter exp1, MarryInterpreter exp2, String data) {
        super(exp1, exp2);
    }

    @Override
    boolean interpret(MarryContext context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
