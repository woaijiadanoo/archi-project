package com.sishuok.jiangzh.archi.designs.bridge.demo.v2;

public class V2UrgencyAbstraction extends V2Abstraction{

    public V2UrgencyAbstraction(SendMethodEnum sendMethodEnum) {
        super(sendMethodEnum);
    }

    public V2UrgencyAbstraction(V2Message v2Message) {
        super(v2Message);
    }

    @Override
    public void message(String user, String message) {
        message = "加急消息 ： "+ message;
        super.sendMessage(user,message);
    }

}
