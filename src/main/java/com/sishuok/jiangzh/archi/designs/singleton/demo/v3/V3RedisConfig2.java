package com.sishuok.jiangzh.archi.designs.singleton.demo.v3;

public class V3RedisConfig2 {

    private V3RedisConfig2(){}

    private static V3RedisConfig2 v3RedisConfig = null;

    public static V3RedisConfig2 getInstance(){
        if(v3RedisConfig == null){
            v3RedisConfig = new V3RedisConfig2();
        }
        return v3RedisConfig;
    }

}
