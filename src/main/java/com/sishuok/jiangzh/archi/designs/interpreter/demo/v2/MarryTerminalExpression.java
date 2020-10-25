package com.sishuok.jiangzh.archi.designs.interpreter.demo.v2;

import com.sishuok.jiangzh.archi.designs.interpreter.impl.AbstrctExpression;
import com.sishuok.jiangzh.archi.designs.interpreter.impl.Context;

public class MarryTerminalExpression extends MarryInterpreter{

    private String data;

    public MarryTerminalExpression(MarryInterpreter exp1, MarryInterpreter exp2,String data) {
        super(exp1, exp2);
        this.data = data;
    }

    @Override
    boolean interpret(MarryContext context) {
        if(context.getData().contains(data)){
            return true;
        }
        return false;
    }
}
