package com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import com.sishuok.jiangzh.archi.shopping.permit.spi.utils.DBHelper;

import java.util.ArrayList;
import java.util.List;

public abstract class DispatcherDAOTemplate<M extends BaseVO> implements DispatcherDAO<M>{

    private String getTableName(M m){
        return m.getClass().getName();
    }
    private List<M> getData(M m){
        String tableName = getTableName(m);
        Object obj = DBHelper.getDb().get(tableName);

        List<M> list = new ArrayList<>();
        if(obj != null){
            list = (List<M>)obj;
        }
        return list;
    }

    private void setData(M m, List<M> data){
        DBHelper.getDb().put(getTableName(m),data);
    }

    @Override
    public void addEntity(M m) {
        List<M> data = getData(m);

        data.add(m);

        setData(m,data);
    }

    @Override
    public void updateEntity(M m) {
        List<M> data = getData(m);

        for(int i=0; i<data.size(); i++){
            if(data.get(i).equals(m)){
                data.set(i,m);
            }
        }

        setData(m,data);
    }

    @Override
    public void removeEntity(M m) {

    }

    @Override
    public M getById(M m, String uuid) {
        List<M> data = getData(m);

        for(int i=0; i<data.size(); i++){
            if(data.get(i).equals(m)){
                return data.get(i);
            }
        }
        return null;
    }

    @Override
    public List<M> getAll(M m, boolean needPage, int beginNum, int pageShow) {
        // TODO 分页不做拉
        return getData(m);
    }

    @Override
    public Long getCount(M m) {
        List<M> data = getData(m);
        return Long.parseLong(data.size()+"");
    }

    @Override
    public List<M> getByCondition(M m, boolean needPage, int beginNum, int pageShow) {
        List<M> data = getData(m);
        List<M> resultList = new ArrayList<>();

        for(int i=0; i<data.size(); i++){
            if(spiltCondition(data.get(i),m)){
                resultList.add(data.get(i));
            }
        }

        return resultList;
    }

    abstract  boolean spiltCondition(M m,M queryModel);

}
