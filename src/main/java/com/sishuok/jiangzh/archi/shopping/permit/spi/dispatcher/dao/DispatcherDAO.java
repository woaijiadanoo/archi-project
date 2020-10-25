package com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;

import java.util.List;

public interface DispatcherDAO<M extends BaseVO> {

    void addEntity(M m);
    void updateEntity(M m);
    void removeEntity(M m);

    M getById(M m,String uuid);
    List<M> getAll(M m,boolean needPage,int beginNum,int pageShow);
    Long getCount(M m);

    List<M> getByCondition(M m,boolean needPage,int beginNum,int pageShow);

}
