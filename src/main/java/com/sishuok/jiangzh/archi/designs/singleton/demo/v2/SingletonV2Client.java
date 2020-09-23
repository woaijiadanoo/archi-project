package com.sishuok.jiangzh.archi.designs.singleton.demo.v2;

public class SingletonV2Client {

    public static void main(String[] args) {
        V2RedisConfig redisConfig = V2RedisConfig.getInstance();

        System.out.println(redisConfig);

    }

}
