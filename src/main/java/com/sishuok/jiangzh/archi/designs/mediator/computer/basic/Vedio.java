package com.sishuok.jiangzh.archi.designs.mediator.computer.basic;

import java.util.concurrent.Callable;

public class Vedio {

    public void vedio(String vedio){
        System.out.println("Vedio = " + vedio);

        CPU cpu = new CPU();
        cpu.openVedio();
    }

}
