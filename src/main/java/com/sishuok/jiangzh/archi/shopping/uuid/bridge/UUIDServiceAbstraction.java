package com.sishuok.jiangzh.archi.shopping.uuid.bridge;

import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDao;
import com.sishuok.jiangzh.archi.shopping.uuid.dao.UUIDDaoImpl2DB;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDService;

/*
    桥接模式的实现
 */
public abstract class UUIDServiceAbstraction implements UUIDService {

    private UUIDDao uuidDao;

    public UUIDServiceAbstraction(UUIDDAOEnum uuiddaoEnum){
        if("DB".equals(uuiddaoEnum.name())){
            this.uuidDao = new UUIDDaoImpl2DB();
        }
        // 如果有其他实现，在这里继续填写
    }

    @Override
    public String getUuid(String businessType) {
        return uuidDao.genUuid(businessType);
    }
}
