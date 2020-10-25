package com.sishuok.jiangzh.archi.shopping.permit.validation.interpreter;

public class OrExpression implements AbstrctExpression {

    private AbstrctExpression exp1;
    private AbstrctExpression exp2;

    public OrExpression(AbstrctExpression exp1, AbstrctExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(Context context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
