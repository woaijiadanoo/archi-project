package com.sishuok.jiangzh.archi.shopping.uuid.service;

import com.sishuok.jiangzh.archi.shopping.uuid.service.bo.FormatModel;
import com.sishuok.jiangzh.archi.shopping.uuid.strategy.IAlrogithmStrategy;

public interface UUIDService {

    // 根据业务类型，获取最新的UUID
    String getUuid(String businessType);

    // 根据业务类型，获取最新的UUID
    String getUuid(String businessType, FormatModel fm, boolean needAlrogithm, IAlrogithmStrategy ias);

}
