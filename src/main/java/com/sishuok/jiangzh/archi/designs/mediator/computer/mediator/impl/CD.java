package com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.impl;

import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Colleague;
import com.sishuok.jiangzh.archi.designs.mediator.computer.mediator.Mediator;

public class CD extends Colleague {

    private String cdInfo;

    public CD(Mediator mediator) {
        super(mediator);
    }

    // 读取光驱
    public void readCD(String cdInfo){
        this.cdInfo = cdInfo;
        // 需要与其他电脑硬件交互
        getMediator().changed(this);
    }

    public String getCdInfo() {
        return cdInfo;
    }

    public void setCdInfo(String cdInfo) {
        this.cdInfo = cdInfo;
    }
}
