package com.sishuok.jiangzh.archi.designs.bridge.demo.v2;

public class V2CommonAbstraction extends V2Abstraction{

    public V2CommonAbstraction(V2Message v2Message) {
        super(v2Message);
    }

    @Override
    public void message(String user, String message) {
        // 统计一下发送
        super.sendMessage(user,message);
    }
}
