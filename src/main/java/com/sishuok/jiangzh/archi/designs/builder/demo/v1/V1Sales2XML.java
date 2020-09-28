package com.sishuok.jiangzh.archi.designs.builder.demo.v1;

import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.List;

public class V1Sales2XML {

    public void out(
            SalesHeaderModel headerModel, SalesFootModel footModel,
            List<SalesBodyModel> bodyModels){

        StringBuffer sb = new StringBuffer();
        sb.append("<sales>\n");
        sb.append(" <company>"+headerModel.getCompanyName()+"</company>\n");
        sb.append(" <date>"+headerModel.getExportDate()+"</date>\n");
        sb.append(" <goodsDetails>\n");
        for(SalesBodyModel bodyModel : bodyModels){
            sb.append("     <goods>\n");
            sb.append("         <name>"+bodyModel.getName()+"</name>\n");
            sb.append("         <price>"+bodyModel.getPrice()+"</price>\n");
            sb.append("         <amount>"+bodyModel.getAmount()+"</amount>\n");
            sb.append("     </goods>\n");
        }
        sb.append(" </goodsDetails>\n");
        sb.append(" <operator>"+footModel.getOperator()+"</operator>\n");
        sb.append("</sales>\n");

        System.out.println("============XML文件内容 begin==============");
        System.out.println(sb);
        System.out.println("============XML文件内容 end==============");
    }

}
