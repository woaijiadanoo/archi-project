package com.sishuok.jiangzh.archi.designs.builder.demo.v1;

import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.Arrays;
import java.util.List;

public class BuilderV1Client {

    public static void main(String[] args) {
        SalesHeaderModel headerModel = new SalesHeaderModel("某东公司","2025-12-20");
        SalesFootModel footModel = new SalesFootModel("Allen");
        List<SalesBodyModel> bodyModels =
                Arrays.asList(
                        new SalesBodyModel("001", 100, 20),
                        new SalesBodyModel("002", 150, 30)
                );

        // 输出至txt文档
        txt(headerModel,footModel,bodyModels);

        // 输出至xml文档
        xml(headerModel,footModel,bodyModels);

    }

    private static void xml(
            SalesHeaderModel headerModel, SalesFootModel footModel, List<SalesBodyModel> bodyModels){
        V1Sales2XML xml = new V1Sales2XML();
        xml.out(headerModel,footModel,bodyModels);
    }

    private static void txt(
            SalesHeaderModel headerModel, SalesFootModel footModel, List<SalesBodyModel> bodyModels){
        V1Sales2TXT txt = new V1Sales2TXT();
        txt.out(headerModel,footModel,bodyModels);
    }

}
