package com.sishuok.jiangzh.archi.shopping.finance.factory;

import com.sishuok.jiangzh.archi.shopping.finance.service.FinanceServiceAPI;
import com.sishuok.jiangzh.archi.shopping.finance.service.FinanceServiceImpl;

public class FinanceFactory {

    public static FinanceServiceAPI createInstance(){
        return new FinanceServiceImpl();
    }

}
