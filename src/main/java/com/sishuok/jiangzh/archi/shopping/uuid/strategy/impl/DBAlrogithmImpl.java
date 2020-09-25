package com.sishuok.jiangzh.archi.shopping.uuid.strategy.impl;

import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDao;
import com.sishuok.jiangzh.archi.shopping.uuid.dao.factory.UUIDDaoFactory;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.AlrogithmlContext;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.IAlrogithmStrategy;

import java.util.UUID;

public class DBAlrogithmImpl implements IAlrogithmStrategy {

    private UUIDDao dao = UUIDDaoFactory.createUUIDDao();

    // jklsd-12312-45234
    @Override
    public String genUuid(AlrogithmlContext context) {
        return dao.genUuid(context.getBusinessType());
    }

}
