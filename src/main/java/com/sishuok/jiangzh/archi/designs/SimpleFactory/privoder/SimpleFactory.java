package com.sishuok.jiangzh.archi.designs.SimpleFactory.privoder;

public class SimpleFactory {

    public static SimpleFactoryApi createApi(String condition){
        if("A".equals(condition)){
            return new SimpleFactoryImplA();
        }else if("B".equals(condition)){
            return new SimpleFactoryImplB();
        }
        return null;
    }

}
