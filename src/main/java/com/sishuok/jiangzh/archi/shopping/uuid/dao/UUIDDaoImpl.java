package com.sishuok.jiangzh.archi.shopping.uuid.dao;

import com.sishuok.jiangzh.archi.shopping.uuid.vo.UUIDModel;

import java.util.HashMap;
import java.util.Map;

public class UUIDDaoImpl implements UUIDDao{

    /*
        order - {businessType:order, uuid: 1}
     */
    private static Map<String, UUIDModel> uuidDB = new HashMap<>();

    /*
        没有考虑任何跟并发有关的东西
     */
    @Override
    public String genUuid(String businessType) {
        UUIDModel uuidModel = uuidDB.get(businessType);
        if(uuidModel == null || uuidModel.getUuid() == null){
            UUIDModel model = new UUIDModel(businessType, 1);
            uuidDB.put(businessType, model);
            return "1";
        }else{
            int uuid = uuidModel.getUuid() + 1;

            uuidModel.setUuid(uuid);
            uuidDB.put(businessType, uuidModel);

            return uuid+"";
        }
    }
}
