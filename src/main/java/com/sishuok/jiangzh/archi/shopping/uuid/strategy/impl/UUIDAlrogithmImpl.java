package com.sishuok.jiangzh.archi.shopping.uuid.strategy.impl;

import com.sishuok.jiangzh.archi.shopping.uuid.strategy.AlrogithmlContext;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.IAlrogithmStrategy;

import java.util.UUID;

public class UUIDAlrogithmImpl implements IAlrogithmStrategy {

    // jklsd-12312-45234
    @Override
    public String genUuid(AlrogithmlContext context) {
        return UUID.randomUUID().toString().replace("-","");
    }

}
