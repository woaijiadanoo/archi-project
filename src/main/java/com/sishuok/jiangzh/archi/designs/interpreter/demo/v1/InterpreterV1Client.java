package com.sishuok.jiangzh.archi.designs.interpreter.demo.v1;

public class InterpreterV1Client {

    public static void main(String[] args) {
        /*
            判断谁结婚了？
            1、规则：Allen 和 Jiangzh 任意一个
            2、规则：Tom Married
         */
        System.out.println("Allen is marry? = " + rule1("Allen"));
        System.out.println("Tom is marry? = " + rule2("Married Tom"));

    }

    public static boolean rule1(String name){
        if(name.contains("Allen") || name.contains("Jiangzh")){
            return true;
        }
        return false;
    }

    public static boolean rule2(String name){
        if(name.contains("Tom") && name.contains("Married")){
            return true;
        }
        return false;
    }


}
