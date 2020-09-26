package com.sishuok.jiangzh.archi.shopping.uuid.monitor;

public interface UUIDServiceMonitorAPI {

    /*
        每一次业务调用，就会触发这个接口实现
     */
    void addBusinessNum(String businessType);

}
