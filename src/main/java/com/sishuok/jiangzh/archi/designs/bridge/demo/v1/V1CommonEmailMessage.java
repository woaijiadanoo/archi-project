package com.sishuok.jiangzh.archi.designs.bridge.demo.v1;

public class V1CommonEmailMessage implements V1Message{
    @Override
    public void sendMessage(String user, String message) {
        System.out.println("给 "+user+" 发送邮件 ："+message);
    }
}
