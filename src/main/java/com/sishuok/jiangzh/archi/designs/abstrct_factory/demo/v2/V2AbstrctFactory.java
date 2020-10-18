package com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.v2;

import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.DriverService;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.USBService;

public interface V2AbstrctFactory {

    USBService createUSB();

    DriverService createDriver();

}
