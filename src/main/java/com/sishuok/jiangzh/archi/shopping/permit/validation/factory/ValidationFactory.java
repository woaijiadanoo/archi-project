package com.sishuok.jiangzh.archi.shopping.permit.validation.factory;

import com.sishuok.jiangzh.archi.shopping.permit.validation.api.ValidationServiceAPI;
import com.sishuok.jiangzh.archi.shopping.permit.validation.api.ValidationServiceImpl;

public class ValidationFactory {

    public static ValidationServiceAPI createValidation(){
        return new ValidationServiceImpl();
    }

}
