package com.sishuok.jiangzh.archi.designs.chain.demo.v2;

public class VPApprovalHandler extends ApprovalHandler{

    @Override
    public void request(HandlerModel handlerModel) {
        if("approval".equals(handlerModel.getHandlerType())){
            approval(handlerModel.getUserName(),handlerModel.getFee(),handlerModel);
        }
    }

    public void approval(String userName, double fee,HandlerModel handlerModel) {
        if(fee <= 50000){
            if("Allen".equals(userName)){
                System.out.println(userName + " , VP审批通过");
            }else{
                System.out.println(userName + " , VP审批不通过");
            }
        }else{
            if(successor != null){
                this.successor.request(handlerModel);
            }
        }
    }
}
