package com.sishuok.jiangzh.archi.designs.builder.demo.v1;

import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.List;

public class V1Sales2TXT {

    public void out(
            SalesHeaderModel headerModel, SalesFootModel footModel,
            List<SalesBodyModel> bodyModels){

        /*
        	某东公司，2025-12-24
			销售单
			商品,单价,成交总数
			001,100,20
			002,150,30
						Allen
         */

        StringBuffer sb = new StringBuffer();
        sb.append(headerModel.getCompanyName()+","+headerModel.getExportDate()+"\n");
        sb.append("销售单\n");
        sb.append("商品,单价,成交总数\n");
        for(SalesBodyModel bodyModel : bodyModels){
            sb.append(bodyModel.getName()+","+bodyModel.getPrice()+","+bodyModel.getAmount()+"\n");
        }
        sb.append("        Allen\n");

        System.out.println("============txt文件内容 begin==============");
        System.out.println(sb);
        System.out.println("============txt文件内容 end==============");
    }

}
