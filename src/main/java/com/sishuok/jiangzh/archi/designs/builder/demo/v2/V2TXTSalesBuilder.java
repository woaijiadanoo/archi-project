package com.sishuok.jiangzh.archi.designs.builder.demo.v2;

import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.List;

public class V2TXTSalesBuilder implements V2SalesBuilder{

    private StringBuffer sb = new StringBuffer();

    @Override
    public void buildHeader(SalesHeaderModel headerModel) {
        sb.append(headerModel.getCompanyName()+","+headerModel.getExportDate()+"\n");
    }

    @Override
    public void buildFooter(SalesFootModel footModel) {
        sb.append("        Allen\n");
    }

    @Override
    public void buildBody(List<SalesBodyModel> bodyModels) {
        sb.append("销售单\n");
        sb.append("商品,单价,成交总数\n");
        for(SalesBodyModel bodyModel : bodyModels){
            sb.append(bodyModel.getName()+","+bodyModel.getPrice()+","+bodyModel.getAmount()+"\n");
        }
    }

    public StringBuffer getResult(){
        return sb;
    }


}
