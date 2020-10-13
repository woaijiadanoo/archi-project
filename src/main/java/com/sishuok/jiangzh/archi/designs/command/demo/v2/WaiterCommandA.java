package com.sishuok.jiangzh.archi.designs.command.demo.v2;

import com.sishuok.jiangzh.archi.designs.command.demo.common.CookieReceiver;

import java.util.List;

public class WaiterCommandA implements WaiterCommand{

    private CookieReceiver coolReceive;
    private CookieReceiver hotReceive;

    public WaiterCommandA(CookieReceiver coolReceive,
                          CookieReceiver hotReceive){
        this.coolReceive = coolReceive;
        this.hotReceive = hotReceive;
    }

    @Override
    public void order(List<String> infos) {
        for(String info : infos){
            if(info.startsWith("凉菜")){
                coolReceive.make(info);
            }else if(info.startsWith("热菜")){
                hotReceive.make(info);
            }
        }
    }
}
