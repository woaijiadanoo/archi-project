package com.sishuok.jiangzh.archi.designs.mediator.computer.mediator;

import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.impl.*;

public class MediatorClient {

    public static void main(String[] args) {
        String cdInfo = "视频信息,声音信息";

        // 中介者实例
        ConcreteMediator mediator = new ConcreteMediator();

        // 具体的同事类
        // 同事类与中介者相互持有对象实例
        CD cd = new CD(mediator);
        CPU cpu = new CPU(mediator);
        Sound sound = new Sound(mediator);
        Vedio vedio = new Vedio(mediator);

        mediator.setCd(cd);
        mediator.setCpu(cpu);
        mediator.setSound(sound);
        mediator.setVedio(vedio);

        // 调用具体的业务逻辑
        cd.readCD(cdInfo);

    }

}
