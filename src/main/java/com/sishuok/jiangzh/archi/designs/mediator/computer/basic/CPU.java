package com.sishuok.jiangzh.archi.designs.mediator.computer.basic;

public class CPU {

    // 视频内容,声音内容
    public void cpu(String cdInfo){
        String[] split = cdInfo.split(",");
        Sound sound = new Sound();
        sound.sound(split[1]);

        Vedio vedio = new Vedio();
        vedio.vedio(split[0]);
    }

    public void openVedio(){
        // TODO
    }
}
