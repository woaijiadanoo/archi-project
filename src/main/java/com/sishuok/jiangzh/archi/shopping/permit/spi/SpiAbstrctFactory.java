package com.sishuok.jiangzh.archi.shopping.permit.spi;

import com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.DispatcherSpiFactory;
import com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao.DispatcherDAO;
import com.sishuok.jiangzh.archi.shopping.permit.spi.validation.ValidationSpiFactory;
import com.sishuok.jiangzh.archi.shopping.permit.spi.validation.dao.ValidationDAO;

public class SpiAbstrctFactory {

    private SpiAbstrctFactory(){}
    private static SpiAbstrctFactory factory = new SpiAbstrctFactory();
    public static SpiAbstrctFactory getInstance(){
        return factory;
    }

    public DispatcherDAO createDispatcherDAO(){
        return DispatcherSpiFactory.createInstance();
    }

    public ValidationDAO createValidationDAO(){
        return ValidationSpiFactory.createInstance();
    }

}
