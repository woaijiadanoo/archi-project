package com.sishuok.jiangzh.archi.designs.singleton.demo.v3;

public class V3RedisConfig {

    private V3RedisConfig(){}

    private static V3RedisConfig v3RedisConfig = new V3RedisConfig();

    public static V3RedisConfig getInstance(){return v3RedisConfig;}

}
