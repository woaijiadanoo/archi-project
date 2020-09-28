package com.sishuok.jiangzh.archi.designs.builder.demo.v2;

import com.sishuok.jiangzh.archi.designs.builder.demo.v1.V1Sales2TXT;
import com.sishuok.jiangzh.archi.designs.builder.demo.v1.V1Sales2XML;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.Arrays;
import java.util.List;

public class BuilderV2Client {

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
        V2XMLSalesBuilder builder = new V2XMLSalesBuilder();
        V2SalesDirector director = new V2SalesDirector(builder);
        director.construct(headerModel,footModel,bodyModels);

        out("xml", builder.getResult());
    }

    private static void txt(
            SalesHeaderModel headerModel, SalesFootModel footModel, List<SalesBodyModel> bodyModels){
        V2TXTSalesBuilder txtSalesBuilder = new V2TXTSalesBuilder();

        V2SalesDirector director = new V2SalesDirector(txtSalesBuilder);
        director.construct(headerModel,footModel,bodyModels);

        out("txt", txtSalesBuilder.getResult());

        // 退化实现
//        txtSalesBuilder.buildHeader(headerModel);
//        txtSalesBuilder.buildBody(bodyModels);
//        txtSalesBuilder.buildFooter(footModel);
//        out("txt", txtSalesBuilder.getResult());
    }

    private static void out(String type,StringBuffer sb){
        System.out.println("============"+type+"文件内容 begin==============");
        System.out.println(sb);
        System.out.println("============"+type+"文件内容 end==============");
    }

}
