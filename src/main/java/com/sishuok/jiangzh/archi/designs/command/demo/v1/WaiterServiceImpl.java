package com.sishuok.jiangzh.archi.designs.command.demo.v1;

import java.util.List;

public class WaiterServiceImpl implements WaiterServiceAPI{

    // 凉菜师傅
    private CookieServiceAPI cool = new CoolServiceImpl();
    // 热菜师傅
    private CookieServiceAPI hot = new HotServiceImpl();

    @Override
    public void order(List<String> infos) {
        for(String info : infos){
            if(info.startsWith("凉菜")){
                cool.make(info);
            }else if(info.startsWith("热菜")){
                hot.make(info);
            }
        }

    }
}
