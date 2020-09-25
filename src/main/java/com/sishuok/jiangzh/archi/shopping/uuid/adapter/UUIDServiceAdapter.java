package com.sishuok.jiangzh.archi.shopping.uuid.adapter;

import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDService;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDServiceImpl;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDStrategyServiceImpl;
import com.sishuok.jiangzh.archi.shopping.uuid.service.bo.FormatModel;
import com.sishuok.jiangzh.archi.shopping.uuid.service.factory.UUIDServiceFactory;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.IAlrogithmStrategy;

public class UUIDServiceAdapter implements UUIDService {

    private UUIDStrategyServiceImpl strategyService = new UUIDStrategyServiceImpl();

    public UUIDServiceAdapter(){}

    @Override
    public String getUuid(String businessType) {
        /*
            将所有旧版本实现切换至新版本的实现中
         */
        FormatModel formatModel = new FormatModel(false,"","",0);
        String uuid = strategyService.getUuid(businessType, formatModel, false, null);
        return uuid;
    }

    @Override
    public String getUuid(String businessType, FormatModel fm, boolean needAlrogithm, IAlrogithmStrategy ias) {
        // 新版本该怎么走怎么走
        return strategyService.getUuid(businessType,fm,needAlrogithm,ias);
    }
}
