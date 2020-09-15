package com.sishuok.jiangzh.archi.designs.bridge.demo.v2;

import com.sishuok.jiangzh.archi.designs.bridge.demo.v1.V1Message;

public class V2EmailMessage implements V2Message{
    @Override
    public void sendMessage(String user, String message) {
        System.out.println("给 "+user+" 发送邮件 ："+message);
    }
}
