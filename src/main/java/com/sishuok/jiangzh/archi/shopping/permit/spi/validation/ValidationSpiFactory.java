package com.sishuok.jiangzh.archi.shopping.permit.spi.validation;

import com.sishuok.jiangzh.archi.shopping.permit.spi.validation.dao.ValidationDAO;
import com.sishuok.jiangzh.archi.shopping.permit.spi.validation.dao.ValidationDAOImpl;

public class ValidationSpiFactory {

    public static ValidationDAO createInstance(){
        return new ValidationDAOImpl();
    }

}
