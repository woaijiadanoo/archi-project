package com.sishuok.jiangzh.archi.designs.singleton.demo.v2;

import lombok.Data;

/*
    Redis的配置类，提供多环境支持 dev , 预发， 生产
 */
public class V2RedisConfig {

    private V2RedisConfig(){}

    private static V2RedisConfig v2RedisConfig = new V2RedisConfig();

    public static V2RedisConfig getInstance(){
        return v2RedisConfig;
    }

    // 具体业务内容
    private String host;
    private String db;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
