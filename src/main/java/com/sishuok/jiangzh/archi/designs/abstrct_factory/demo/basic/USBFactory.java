package com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic;

public class USBFactory {

    public static USBService createUSB(int type){
        if(type==2){
            return new USB2ServiceImpl();
        }else if(type == 3){
            return new USB3ServiceImpl();
        }
        return null;
    }

}
