package com.sishuok.jiangzh.archi.shopping.uuid.dao.factory;

import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDao;
import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDaoImpl2DB;

public class UUIDDaoFactory {

    private UUIDDaoFactory(){};

    private static UUIDDao dao = new UUIDDaoImpl2DB();

    public static UUIDDao createUUIDDao(){
        return dao;
    }

}
