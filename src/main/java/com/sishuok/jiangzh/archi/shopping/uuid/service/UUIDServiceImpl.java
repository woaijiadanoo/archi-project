package com.sishuok.jiangzh.archi.shopping.uuid.service;

import com.sishuok.jiangzh.archi.shopping.uuid.bridge.UUIDDAOEnum;
import com.sishuok.jiangzh.archi.shopping.uuid.bridge.UUIDServiceAbstraction;
import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDao;
import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDaoImpl2DB;
import com.sishuok.jiangzh.archi.shopping.uuid.service.bo.FormatModel;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.IAlrogithmStrategy;

public class UUIDServiceImpl extends UUIDServiceAbstraction {

    public UUIDServiceImpl(UUIDDAOEnum uuiddaoEnum) {
        super(uuiddaoEnum);
    }

    @Override
    public String getUuid(String businessType) {
        // 完成UUID生成并返回
        return super.getUuid(businessType);
    }

    @Override
    public String getUuid(String businessType, FormatModel fm, boolean needAlrogithm, IAlrogithmStrategy ias) {
        return null;
    }
}
