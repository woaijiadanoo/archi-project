package com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.impl;

import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Colleague;
import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Mediator;

public class Vedio extends Colleague {

    public Vedio(Mediator mediator) {
        super(mediator);
    }

    public void vedio(String vedio){
        System.out.println("Vedio = " + vedio);
        // 需要与其他电脑硬件交互
        getMediator().changed(this);
    }

}
