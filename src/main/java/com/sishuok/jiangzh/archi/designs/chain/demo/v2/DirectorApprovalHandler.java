package com.sishuok.jiangzh.archi.designs.chain.demo.v2;

public class DirectorApprovalHandler extends ApprovalHandler{
    @Override
    public void approval(String userName, double fee) {
        if(fee <= 2000){
            if("Allen".equals(userName)){
                System.out.println(userName + " , 总监审批通过");
            }else{
                System.out.println(userName + " , 总监审批不通过");
            }
        }else{
            if(successor != null){
                this.successor.approval(userName, fee);
            }
        }
    }
}
