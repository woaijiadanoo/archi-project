package com.sishuok.jiangzh.archi.designs.mediator.impl;

public class ConcreteColleagueA extends Colleague{

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    // do somethings

    // 与其他同事类进行交互，通知，修改...
    public void operation(){
        getMediator().changed(this);
    }

}
