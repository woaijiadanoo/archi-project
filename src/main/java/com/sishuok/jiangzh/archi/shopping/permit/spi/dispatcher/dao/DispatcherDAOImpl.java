package com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;

import java.util.List;

public class DispatcherDAOImpl<M extends BaseVO> implements DispatcherDAO<M>{
    @Override
    public void addEntity(M m) {

    }

    @Override
    public void updateEntity(M m) {

    }

    @Override
    public void removeEntity(M m) {

    }

    @Override
    public M getById(M m, String uuid) {
        return null;
    }

    @Override
    public List<M> getAll(M m, boolean needPage, int beginNum, int pageShow) {
        return null;
    }

    @Override
    public Long getCount(M m) {
        return null;
    }

    @Override
    public List<M> getByCondition(M m, boolean needPage, int beginNum, int pageShow) {
        return null;
    }
}
