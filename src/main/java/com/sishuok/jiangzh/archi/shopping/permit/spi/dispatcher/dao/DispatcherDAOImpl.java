package com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo.ResourcePermitModel;

public class DispatcherDAOImpl<M extends BaseVO> extends DispatcherDAOTemplate<M> implements DispatcherDAO<M>{

    /*
        m -> uuid:1, name:Allen, age:18
        query -> name:Allen, uuid:null,age:null
     */

    public static void main(String[] args) {
        DispatcherDAOImpl dispatcherDAO = new DispatcherDAOImpl();

        ResourcePermitModel target = new ResourcePermitModel();
        target.setPermitId("permitId1");
        target.setResourceId("resource1");

        ResourcePermitModel query = new ResourcePermitModel();
        query.setResourceId("resource2");

        System.out.println("是否匹配： "+dispatcherDAO.spiltCondition(target,query));

    }

    @Override
    boolean spiltCondition(M m, M query) {
        String name = m.getClass().getSimpleName();
        System.out.println("name = " + name);
        if(name.equals("ResourcePermitModel")){
            return resourcePerimitMatch(m,query);
        }else if(name.equals("PermitModel")){
            return permitModelMatch(m,query);
        }else if(name.equals("ResourceDispatcherModel")){
            return resourceDispatcherModel(m,query);
        }else if(name.equals("ResourceModel")){
            return resourceModel(m,query);
        }else if(name.equals("RoleModel")){
            return roleModel(m,query);
        }else if(name.equals("UserModel")){
            return userModel(m,query);
        }else if(name.equals("UserRoleModel")){
            return userRoleModel(m,query);
        }
        return false;
    }

    private boolean resourcePerimitMatch(M m,M q){

        return hasValue(m,q,"resourceId='") || hasValue(m,q,"permitId='");
    }
    private boolean permitModelMatch(M m,M q){
        return hasValue(m,q,"permitStr='");
    }
    private boolean resourceDispatcherModel(M m,M q){
        return hasValue(m,q,"ownerId='") || hasValue(m,q,"type=",",")|| hasValue(m,q,"resourcePermitId='");
    }
    private boolean resourceModel(M m,M q){
        return hasValue(m,q,"resourceName='") || hasValue(m,q,"resourcePath='");
    }
    private boolean roleModel(M m,M q){
        return hasValue(m,q,"showName='") || hasValue(m,q,"roleName='");
    }
    private boolean userModel(M m,M q){
        return hasValue(m,q,"userName='");
    }
    private boolean userRoleModel(M m,M q){
        return hasValue(m,q,"userId='") || hasValue(m,q,"roleId='");
    }

    private boolean hasValue(M m,M query,String beignStr){
        return hasValue(m,query,beignStr,"'");
    }


    private boolean hasValue(M m,M query,String beignStr,String endStr){
        int beginIndex = m.toString().indexOf(beignStr) + beignStr.length();
        int endIndex = beginIndex + m.toString().substring(beginIndex).indexOf("endStr");

        String value = m.toString().substring(beginIndex,endIndex);
        System.out.println("hasValue value = " + value);
        System.out.println("query = " + query.toString());
        if(query.toString().contains(value)){
            return true;
        }
        return false;
    }

}
