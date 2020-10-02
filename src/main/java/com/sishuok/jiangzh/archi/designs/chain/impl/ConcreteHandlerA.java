package com.sishuok.jiangzh.archi.designs.chain.impl;

public class ConcreteHandlerA extends Handler{
    @Override
    public void handleRequest() {
        boolean someCondition = false;
        // 判断这个内容是不是应该我自己处理
        if(someCondition){
            // TODO
        }else{
            // 如果不是我自己处理， 则应该交给其他人处理
            if(this.successor != null){
                this.successor.handleRequest();
            }
        }

    }
}
