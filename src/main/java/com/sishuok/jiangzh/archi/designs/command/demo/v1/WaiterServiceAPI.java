package com.sishuok.jiangzh.archi.designs.command.demo.v1;

import java.util.List;

public interface WaiterServiceAPI {

    // info 菜品信息 凉菜-xxx, 热菜-xxx
    void order(List<String> info);

}
