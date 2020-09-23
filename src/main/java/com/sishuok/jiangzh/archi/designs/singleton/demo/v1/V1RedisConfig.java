package com.sishuok.jiangzh.archi.designs.singleton.demo.v1;

import lombok.Data;

/*
    Redis的配置类，提供多环境支持 dev , 预发， 生产
 */
@Data
public class V1RedisConfig {

    private String host;
    private String db;
    private int port;

}
