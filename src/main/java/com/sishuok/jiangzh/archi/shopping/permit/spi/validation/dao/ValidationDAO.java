package com.sishuok.jiangzh.archi.shopping.permit.spi.validation.dao;

public interface ValidationDAO {

    String getResourceIdByPath(String resourcePath);
    String getPermitIdByName(String name);
    String getRPermitIdByResIdAndPerId(String resourceId,String permitId);
    boolean hasPermit(String userId,String resourcePermitId);

    String getRoleByTrueName(String trueName);
    boolean isRole(String userId,String roleId);
}
