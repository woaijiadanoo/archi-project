package com.sishuok.jiangzh.archi.designs.chain.demo.v2;

public class DirectorApprovalHandler extends ApprovalHandler{

    @Override
    public void request(HandlerModel handlerModel) {
        if("approval".equals(handlerModel.getHandlerType())){
            approval(handlerModel.getUserName(),handlerModel.getFee(),handlerModel);
        }
    }

    public void approval(String userName, double fee,HandlerModel handlerModel) {
        if(fee <= 2000){
            if("Allen".equals(userName)){
                System.out.println(userName + " , 总监审批通过");
            }else{
                System.out.println(userName + " , 总监审批不通过");
            }
        }else{
            if(successor != null){
                this.successor.request(handlerModel);
            }
        }
    }
}
