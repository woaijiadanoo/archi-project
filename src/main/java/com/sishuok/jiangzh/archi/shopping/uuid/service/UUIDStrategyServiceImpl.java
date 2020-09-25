package com.sishuok.jiangzh.archi.shopping.uuid.service;

import com.sishuok.jiangzh.archi.shopping.uuid.service.bo.FormatModel;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.AlrogithmlContext;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.IAlrogithmStrategy;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.impl.DBAlrogithmImpl;

public class UUIDStrategyServiceImpl implements UUIDService{
    @Override
    public String getUuid(String businessType) {
        return null;
    }

    // 只实现这个逻辑
    @Override
    public String getUuid(String businessType, FormatModel fm, boolean needAlrogithm, IAlrogithmStrategy ias) {
        // 组织算法策略
        IAlrogithmStrategy strategy = new DBAlrogithmImpl();
        if(needAlrogithm) {
            if (ias != null) {
                strategy = ias;
            }
        }
        AlrogithmlContext context = new AlrogithmlContext(strategy);
        context.setBusinessType(businessType);
        // 1，2，3
        String uuid = context.getUuid();
        // 是否需要格式化
        if(fm.isNeedFormat()){
            return formatUuid(fm,uuid);
        }else{
            return uuid;
        }
    }

    // 替换#的内容为UUID  # -> uuid

    private String formatUuid(FormatModel fm, String uuid){
        String uuidResult = "";
        String tempStr = ""; // StringBuffer
        // 长度限制
        if(uuid.trim().length() > fm.getIdLength()){
            uuidResult = uuid.substring(0,fm.getIdLength());
        }else{
            /*
                长度是 7
                uuid 10
                result : 0000010
             */
            for(int i=0; i < (fm.getIdLength() - uuid.trim().length()); i++){
                tempStr += fm.getReplaceStr();
            }

            uuidResult = tempStr + uuid;
        }

        String result = fm.getResult().replace("#", uuidResult);

        return result;
    }

}
