package com.sishuok.jiangzh.archi.shopping.uuid.service;

public interface UUIDService {

    // 根据业务类型，获取最新的UUID
    String getUuid(String businessType);

}
