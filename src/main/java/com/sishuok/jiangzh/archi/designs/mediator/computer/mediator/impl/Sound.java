package com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.impl;

import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Colleague;
import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Mediator;

public class Sound  extends Colleague {

    public Sound(Mediator mediator) {
        super(mediator);
    }

    public void sound(String sound){
        System.out.println("sound = " + sound);
    }

}
