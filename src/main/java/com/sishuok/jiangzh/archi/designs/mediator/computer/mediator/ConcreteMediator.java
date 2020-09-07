package com.sishuok.jiangzh.archi.designs.mediator.computer.mediator;

import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.impl.*;

// 中介者实现类
public class ConcreteMediator implements Mediator {

    private CD cd;
    private CPU cpu;
    private Vedio vedio;
    private Sound sound;

    /*
        1、 CD读取CD信息
        2、 将CD信息发送给CPU
        3、 CPU将信息拆分成影像和声音
        4、 CPU将影响和声音分别发送给显卡和声卡
        5、 显卡调用CPU打开播放器
     */
    @Override
    public void changed(Colleague colleague) {
        // 同事类的交互逻辑
        if(colleague instanceof CD){
            // 将CD信息发送给CPU
            cpu.cd(((CD) colleague).getCdInfo());
        }

        if(colleague instanceof CPU){
            // CPU将影响和声音分别发送给显卡和声卡
            sound.sound(((CPU) colleague).getSoundInfo());
            vedio.vedio(((CPU) colleague).getVedioInfo());
        }

        if(colleague instanceof Vedio){
            // 显卡调用CPU打开播放器
            cpu.openVedio();
        }

    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVedio(Vedio vedio) {
        this.vedio = vedio;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }
}
