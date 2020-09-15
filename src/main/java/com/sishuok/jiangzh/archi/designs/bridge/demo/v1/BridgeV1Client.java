package com.sishuok.jiangzh.archi.designs.bridge.demo.v1;

public class BridgeV1Client {

    public static void main(String[] args) {
//        V1Message sms = new V1CommonSMSMessage();
        V1Message email = new V1CommonEmailMessage();

        email.sendMessage("张三", "Hello World");


    }

}
