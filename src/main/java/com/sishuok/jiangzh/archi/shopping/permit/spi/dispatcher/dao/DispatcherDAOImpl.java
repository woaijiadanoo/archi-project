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
        }
        return false;
    }

    private boolean resourcePerimitMatch(M m,M q){
        return hasValue(m,q,"resourceId='") || hasValue(m,q,"permitId='");
    }

    private boolean hasValue(M m,M query,String beignStr){
        int beginIndex = m.toString().indexOf(beignStr) + beignStr.length();
        int endIndex = beginIndex + m.toString().substring(beginIndex).indexOf("'");

        String value = m.toString().substring(beginIndex,endIndex);
        System.out.println("hasValue value = " + value);
        System.out.println("query = " + query.toString());
        if(query.toString().contains(value)){
            return true;
        }
        return false;
    }

}
