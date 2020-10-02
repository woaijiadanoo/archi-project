package com.sishuok.jiangzh.archi.designs.chain.demo.v2;

public class ManagerApprovalHandler extends ApprovalHandler{
    @Override
    public void request(HandlerModel handlerModel) {
        if("approval".equals(handlerModel.getHandlerType())){
            approval(handlerModel.getUserName(),handlerModel.getFee(),handlerModel);
        }
    }

    private void approval(String userName, double fee,HandlerModel handlerModel){
        if(fee <= 1000){
            if("Allen".equals(userName)){
                System.out.println(userName + " , 部门负责人审批通过");
            }else{
                System.out.println(userName + " , 部门负责人审批不通过");
            }
        }else{
            if(successor != null){
                this.successor.request(handlerModel);
            }
        }
    }

}
