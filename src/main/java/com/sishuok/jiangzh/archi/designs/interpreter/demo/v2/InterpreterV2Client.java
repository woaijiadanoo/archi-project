package com.sishuok.jiangzh.archi.designs.interpreter.demo.v2;

public class InterpreterV2Client {

    public static void main(String[] args) {
        /*
            判断谁结婚了？
            1、规则：Allen 和 Jiangzh 任意一个
            2、规则：Tom Married
         */

        System.out.println("Allen is marry? = " + rule1().interpret(new MarryContext("Allen")));
        System.out.println("Tom is marry? = " + rule2().interpret(new MarryContext("Married Tom")));

    }

    public static MarryInterpreter rule1(){
        MarryTerminalExpression exp1 = new MarryTerminalExpression(null,null,"Allen");
        MarryTerminalExpression exp2 = new MarryTerminalExpression(null,null,"Jiangzh");

        MarryInterpreter interpreter = new MarryOrTerminalExpression(exp1,exp2,"");
        return interpreter;
    }

    public static MarryInterpreter rule2(){
        MarryTerminalExpression exp1 = new MarryTerminalExpression(null,null,"Tom");
        MarryTerminalExpression exp2 = new MarryTerminalExpression(null,null,"Married");

        MarryInterpreter interpreter = new MarryAndTerminalExpression(exp1,exp2,"");
        return interpreter;
    }
}
