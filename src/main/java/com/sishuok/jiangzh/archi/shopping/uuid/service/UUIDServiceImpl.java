package com.sishuok.jiangzh.archi.shopping.uuid.service;

import com.sishuok.jiangzh.archi.shopping.uuid.bridge.UUIDDAOEnum;
import com.sishuok.jiangzh.archi.shopping.uuid.bridge.UUIDServiceAbstraction;
import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDao;
import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDaoImpl2DB;

public class UUIDServiceImpl extends UUIDServiceAbstraction {

    public UUIDServiceImpl(UUIDDAOEnum uuiddaoEnum) {
        super(uuiddaoEnum);
    }

    @Override
    public String getUuid(String businessType) {
        // 完成UUID生成并返回
        return super.getUuid(businessType);
    }
}
