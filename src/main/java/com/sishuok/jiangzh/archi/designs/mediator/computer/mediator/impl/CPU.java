package com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.impl;

import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Colleague;
import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Mediator;

public class CPU  extends Colleague {

    private String soundInfo;
    private String vedioInfo;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    // 视频内容,声音内容
    public void cd(String cdInfo){
        String[] split = cdInfo.split(",");
        this.soundInfo = split[1];
        this.vedioInfo = split[0];
        // 需要与其他电脑硬件交互
        getMediator().changed(this);
    }

    public void openVedio(){
        System.out.println("打开播放器");
    }

    public String getSoundInfo() {
        return soundInfo;
    }

    public void setSoundInfo(String soundInfo) {
        this.soundInfo = soundInfo;
    }

    public String getVedioInfo() {
        return vedioInfo;
    }

    public void setVedioInfo(String vedioInfo) {
        this.vedioInfo = vedioInfo;
    }
}
