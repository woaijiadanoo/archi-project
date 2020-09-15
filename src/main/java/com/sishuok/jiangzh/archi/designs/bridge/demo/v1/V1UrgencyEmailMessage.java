package com.sishuok.jiangzh.archi.designs.bridge.demo.v1;

public class V1UrgencyEmailMessage implements V1UrgencyMessage{
    @Override
    public void sendMessage(String user, String message) {
        System.out.println("给 "+user+" 发送加急邮件 ："+message);
    }
}
