package com.sishuok.jiangzh.archi.designs.interpreter.demo.v2;

public abstract class MarryInterpreter {

    protected MarryInterpreter exp1;
    protected MarryInterpreter exp2;

    public MarryInterpreter(MarryInterpreter exp1,MarryInterpreter exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    abstract boolean interpret(MarryContext context);


}
