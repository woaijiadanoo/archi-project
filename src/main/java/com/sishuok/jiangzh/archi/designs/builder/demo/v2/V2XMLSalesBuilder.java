package com.sishuok.jiangzh.archi.designs.builder.demo.v2;

import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesBodyModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesFootModel;
import com.sishuok.jiangzh.archi.designs.builder.demo.vo.SalesHeaderModel;

import java.util.List;

public class V2XMLSalesBuilder implements V2SalesBuilder{

    private StringBuffer sb = new StringBuffer();

    @Override
    public void buildHeader(SalesHeaderModel headerModel) {
        sb.append("<sales>\n");
        sb.append(" <company>"+headerModel.getCompanyName()+"</company>\n");
        sb.append(" <date>"+headerModel.getExportDate()+"</date>\n");
    }

    @Override
    public void buildFooter(SalesFootModel footModel) {
        sb.append(" <operator>"+footModel.getOperator()+"</operator>\n");
        sb.append("</sales>\n");
    }

    @Override
    public void buildBody(List<SalesBodyModel> bodyModels) {
        sb.append(" <goodsDetails>\n");
        for(SalesBodyModel bodyModel : bodyModels){
            sb.append("     <goods>\n");
            sb.append("         <name>"+bodyModel.getName()+"</name>\n");
            sb.append("         <price>"+bodyModel.getPrice()+"</price>\n");
            sb.append("         <amount>"+bodyModel.getAmount()+"</amount>\n");
            sb.append("     </goods>\n");
        }
        sb.append(" </goodsDetails>\n");
    }

    public StringBuffer getResult(){
        return sb;
    }

}
