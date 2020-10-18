package com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.v1;

import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.DriverFactory;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.DriverService;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.USBFactory;
import com.sishuok.jiangzh.archi.designs.abstrct_factory.demo.basic.USBService;

public class USBV1Producter {

    public static void main(String[] args) {
        // USB驱动
        DriverService driver = DriverFactory.installDriver(2);
        // USB硬件
        USBService usb = USBFactory.createUSB(2);

        System.out.println("usb : " + usb.createUSB() + " , driver : "+ driver.installDriver());

    }

}
