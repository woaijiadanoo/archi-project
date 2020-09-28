package com.sishuok.jiangzh.archi.designs.builder.demo.v2;

import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.List;

public interface V2SalesBuilder {

    void buildHeader(SalesHeaderModel headerModel);

    void buildFooter(SalesFootModel footModel);

    void buildBody(List<SalesBodyModel> bodyModels);

}
