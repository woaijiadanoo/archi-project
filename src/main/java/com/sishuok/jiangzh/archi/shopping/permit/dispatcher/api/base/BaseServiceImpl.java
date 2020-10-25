package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base;

import com.sishuok.jiangzh.archi.shopping.permit.spi.SpiAbstrctFactory;
import com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao.DispatcherDAO;

import java.util.List;

public class BaseServiceImpl<M extends BaseVO> implements BaseService<M>{

    private static SpiAbstrctFactory factory = null;
    private static DispatcherDAO dao;
    static {
        factory = SpiAbstrctFactory.getInstance();
        dao = factory.createDispatcherDAO();
    }

    @Override
    public void addEntity(M m) {
        dao.addEntity(m);
    }

    @Override
    public void updateEntity(M m) {
        dao.updateEntity(m);
    }

    @Override
    public void removeEntity(M m) {
        dao.removeEntity(m);
    }

    @Override
    public M getById(M m, String uuid) {
        return (M)dao.getById(m,uuid);
    }

    @Override
    public List<M> getAll(M m, boolean needPage, int beginNum, int pageShow) {
        return dao.getAll(m,needPage,beginNum,pageShow);
    }

    @Override
    public Long getCount(M m) {
        return dao.getCount(m);
    }

    @Override
    public List<M> getByCondition(M m, boolean needPage, int beginNum, int pageShow) {
        return dao.getByCondition(m,needPage,beginNum,pageShow);
    }
}
