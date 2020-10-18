package com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.v2;

import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.DriverFactory;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.DriverService;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.USBFactory;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.USBService;

public class USBV2Producter {

    public static void main(String[] args) {
        // 决定具体要哪一个版本的USB
        V2AbstrctFactory factory = new V2USB3Factory();

        USBService usb = factory.createUSB();
        DriverService driver = factory.createDriver();

        System.out.println("usb : " + usb.createUSB()+ " , driver : "+ driver.installDriver());

    }

}
