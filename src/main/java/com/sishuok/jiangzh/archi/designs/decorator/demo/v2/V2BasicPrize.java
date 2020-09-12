package com.sishuok.jiangzh.archi.designs.decorator.demo.v2;

public class V2BasicPrize extends V2Prize{
    @Override
    public double calcPrize(String user) {
        // 底薪 -> 无底薪
        return 0.0;
    }
}
