package com.sishuok.jiangzh.archi.designs.strategy.demo.v3;

public interface V3PriceStrategy {

    // originPrice - 原始价格
    double calcPrice(V3PriceContext context);

}
