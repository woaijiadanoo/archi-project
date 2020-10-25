package com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher;

import com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao.DispatcherDAO;
import com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao.DispatcherDAOImpl;

public class DispatcherSpiFactory {

    public static DispatcherDAO createInstance(){
        return new DispatcherDAOImpl();
    }

}
