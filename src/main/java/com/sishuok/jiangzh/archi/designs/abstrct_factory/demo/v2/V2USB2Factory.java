package com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.v2;

import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.Driver2ServiceImpl;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.DriverService;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.USB2ServiceImpl;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.USBService;

public class V2USB2Factory implements V2AbstrctFactory{
    @Override
    public USBService createUSB() {
        return new USB2ServiceImpl();
    }

    @Override
    public DriverService createDriver() {
        return new Driver2ServiceImpl();
    }
}
