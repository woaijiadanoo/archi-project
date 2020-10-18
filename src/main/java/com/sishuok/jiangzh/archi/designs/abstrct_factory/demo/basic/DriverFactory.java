package com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic;

public class DriverFactory {

    public static DriverService installDriver(int type){
        if(type==2){
            return new Driver2ServiceImpl();
        }else if(type == 3){
            return new Driver3ServiceImpl();
        }
        return null;
    }

}
