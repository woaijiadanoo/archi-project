package com.sishuok.jiangzh.archi.designs.bridge.demo.v2;

import com.sishuok.jiangzh.archi.designs.bridge.impl.Implementor;

public abstract class V2Abstraction {

    private V2Message v2Message;

    public V2Abstraction(V2Message v2Message){
        this.v2Message = v2Message;
    }

    public V2Abstraction(SendMethodEnum sendMethodEnum){
        // 加一个实现
        if(sendMethodEnum == null){
            v2Message = new V2SMSMessage();
        }
        if(sendMethodEnum.name().equals("SMS")){
            v2Message = new V2SMSMessage();
        }else if(sendMethodEnum.name().equals("EMAIL")){
            v2Message = new V2EmailMessage();
        }
    }

    public void sendMessage(String user,String message){
        v2Message.sendMessage(user,message);
    }

    public abstract void message(String user,String message);

}
