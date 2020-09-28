package com.sishuok.jiangzh.archi.designs.builder.demo.v2;

import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.List;

public class V2SalesDirector {

    private V2SalesBuilder builder;

    public V2SalesDirector(V2SalesBuilder builder){
        this.builder = builder;
    }

    // 组件最终的内容
    public void construct(
            SalesHeaderModel headerModel, SalesFootModel footModel, List<SalesBodyModel> bodyModels){

        builder.buildHeader(headerModel);
        builder.buildBody(bodyModels);
        builder.buildFooter(footModel);

    }

}
