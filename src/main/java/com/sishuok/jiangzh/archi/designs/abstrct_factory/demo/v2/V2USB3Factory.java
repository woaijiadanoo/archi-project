package com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.v2;

import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.*;

public class V2USB3Factory implements V2AbstrctFactory{
    @Override
    public USBService createUSB() {
        return new USB3ServiceImpl();
    }

    @Override
    public DriverService createDriver() {
        return new Driver3ServiceImpl();
    }
}
