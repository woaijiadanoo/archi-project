package com.sishuok.jiangzh.archi.shopping.permit.validation.interpreter;

import com.sishuok.jiangzh.archi.shopping.permit.spi.SpiAbstrctFactory;
import com.sishuok.jiangzh.archi.shopping.permit.spi.validation.dao.ValidationDAO;

public class TerminalExpression implements AbstrctExpression{

    private String expressionStr;  // P:p1
    private ValidationDAO dao = SpiAbstrctFactory.getInstance().createValidationDAO();

    public TerminalExpression(String expressionStr){
        this.expressionStr = expressionStr;
    }

    @Override
    public boolean interpret(Context context) {
        String permitId = expressionStr.split("P:")[1].trim();
        String resourceId = dao.getResourceIdByPath(context.getResourcePath());
        String resourcePermitId = dao.getRPermitIdByResIdAndPerId(resourceId,permitId);

        boolean hasPermit = dao.hasPermit(context.getUserId(), resourcePermitId);

        return hasPermit;
    }
}
