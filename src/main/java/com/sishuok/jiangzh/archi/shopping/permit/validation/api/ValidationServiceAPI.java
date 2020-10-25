package com.sishuok.jiangzh.archi.shopping.permit.validation.api;

import java.util.List;

public interface ValidationServiceAPI {

    // 查询某人是否有相应的权限
    boolean hasPermit(String userId,String resourcePath,String permitName);

    // 某人是否具有多条权限[ and , or]
    boolean hasPermitAnd(String userId, String resourcePath, List<String> permitNames);
    boolean hasPermitOr(String userId, String resourcePath, List<String> permitNames);

    // 用户是否具有某个角色
    boolean hasRole(String userId,String roleOnlyName);

    // 用户是否具有多个角色[ and , or]
    boolean hasRoleAnd(String userId,List<String> roleOnlyNames);
    boolean hasRoleOr(String userId,List<String> roleOnlyNames);

    // 用户权限表达式判断
    boolean hasPermitByExp(String userId,String resourcePath,String exprestionStr);
}
