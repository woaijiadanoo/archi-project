package com.sishuok.jiangzh.archi.designs.bridge.demo.v2;

public class BridgeV2Client {

    public static void main(String[] args) {
//        V2Message message = new V2SMSMessage();
//        V2Abstraction abstraction = new V2UrgencyAbstraction(message);

        // 修改选择实现
        V2Abstraction abstraction = new V2UrgencyAbstraction(SendMethodEnum.SMS);

        abstraction.message("张三","Hello World");

    }

}
