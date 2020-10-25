package com.sishuok.jiangzh.archi.designs.interpreter.impl;

public class TerminalExpression extends AbstrctExpression{

    public TerminalExpression(AbstrctExpression exp1, AbstrctExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public boolean interpret(Context context) {
        // 具体的业务实现
        return false;
    }
}
