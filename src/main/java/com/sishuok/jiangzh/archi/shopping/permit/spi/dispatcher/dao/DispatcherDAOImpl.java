package com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;

public class DispatcherDAOImpl<M extends BaseVO> extends DispatcherDAOTemplate<M> implements DispatcherDAO<M>{

    @Override
    boolean spiltCondition(BaseVO baseVO, BaseVO queryModel) {
        return false;
    }
}
