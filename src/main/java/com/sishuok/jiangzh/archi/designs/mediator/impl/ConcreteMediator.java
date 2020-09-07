package com.sishuok.jiangzh.archi.designs.mediator.impl;

// 中介者实现类
public class ConcreteMediator implements Mediator{

    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    @Override
    public void changed(Colleague colleague) {
        // 所有交互逻辑都写在这个方法中
        // TODO 这一部分内容是具体业务，跟设计模式无关
        if(colleague instanceof ConcreteColleagueA){
            // 修改B的一些内容
        }
    }


    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

}
