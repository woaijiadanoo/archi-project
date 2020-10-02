package com.sishuok.jiangzh.archi.designs.chain.demo.v2;

public abstract class ApprovalHandler {

    protected ApprovalHandler successor;

    public void setSuccessor(ApprovalHandler successor){
        this.successor = successor;
    }

    // 演示内链
    public static ApprovalHandler getApprovalHandler(){
        // 确定有多少个流程节点
        ApprovalHandler manager = new ManagerApprovalHandler();
        ApprovalHandler director = new DirectorApprovalHandler();
        ApprovalHandler vp = new VPApprovalHandler();

        // 一定要注意，是有流程顺序的
        manager.setSuccessor(director);
        director.setSuccessor(vp);

        return manager;
    }

    public abstract void approval(String userName,double fee);

}
