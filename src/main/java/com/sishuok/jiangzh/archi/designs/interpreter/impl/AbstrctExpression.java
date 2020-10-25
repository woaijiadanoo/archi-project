package com.sishuok.jiangzh.archi.designs.interpreter.impl;

public abstract class AbstrctExpression {

    protected AbstrctExpression exp1;
    protected AbstrctExpression exp2;

    public AbstrctExpression(AbstrctExpression exp1,AbstrctExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    abstract boolean interpret(Context context);

}
