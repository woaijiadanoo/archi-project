package com.sishuok.jiangzh.archi.shopping.permit.validation.api;

import com.sishuok.jiangzh.archi.shopping.permit.spi.SpiAbstrctFactory;
import com.sishuok.jiangzh.archi.shopping.permit.spi.validation.dao.ValidationDAO;

import java.util.List;

public class ValidationServiceImpl implements ValidationServiceAPI{

    private ValidationDAO dao = SpiAbstrctFactory.getInstance().createValidationDAO();

    @Override
    public boolean hasPermit(String userId, String resourcePath, String permitName) {
        /*
            1、根据resourcePath获取resourceId
            2、获取permitId
            3、resourceId + permitId ，获取 resourcePermitId
            4、根据userId + resourcePermitId , 判断是否有权限
         */
        String resourceId = dao.getResourceIdByPath(resourcePath);
        String permitId = dao.getPermitIdByName(permitName);
        String resourcePermitId = dao.getRPermitIdByResIdAndPerId(resourceId,permitId);

        boolean hasPermit = dao.hasPermit(userId, resourcePermitId);

        return hasPermit;
    }

    @Override
    public boolean hasPermitAnd(String userId, String resourcePath, List<String> permitNames) {
        for(String permitName : permitNames){
            if(!hasPermit(userId,resourcePath,permitName)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean hasPermitOr(String userId, String resourcePath, List<String> permitNames) {
        for(String permitName : permitNames){
            if(hasPermit(userId,resourcePath,permitName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasRole(String userId, String roleOnlyName) {
        String roleId = dao.getRoleByTrueName(roleOnlyName);
        if(dao.isRole(userId,roleId)){
            return true;
        }
        return false;
    }

    @Override
    public boolean hasRoleAnd(String userId, List<String> roleOnlyNames) {
        for(String roleOnlyName : roleOnlyNames){
            if(!hasRole(userId,roleOnlyName)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean hasRoleOr(String userId, List<String> roleOnlyNames) {
        for(String roleOnlyName : roleOnlyNames){
            if(hasRole(userId,roleOnlyName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasPermitByExp(String userId, String resourcePath, String exprestionStr) {
        return false;
    }
}
