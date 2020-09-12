package com.sishuok.jiangzh.archi.shopping.finance.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GoodsBasicFlyweightFactory {
    // 可以考虑切换成Redis， Memcached， Hbase
    private static Map<String, GoodsBasicFlyweight> flyweightDB = new HashMap<>();

    // 业务中一般通过goodsId，去数据库中查询对应的商品名称和价格
    // 我们没有数据库， 所以偷个懒
    public static GoodsBasicFlyweight getFlyweight(String goodsId,String goodsName,double price){
        GoodsBasicFlyweight goodsBasicFlyweight = flyweightDB.get(goodsId);
        if(goodsBasicFlyweight == null){
            goodsBasicFlyweight = new GoodsBasicFlyweightImpl(goodsId,goodsName,price);

            flyweightDB.put(goodsId, goodsBasicFlyweight);
        }
        return goodsBasicFlyweight;
    }

}
