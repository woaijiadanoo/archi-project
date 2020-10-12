package com.sishuok.jiangzh.archi.designs.chain.demo.v2;

public class ChainV2Client {

    private static void test01(String userName, double fee){
        // 确定有多少个流程节点
        ApprovalHandler manager = new ManagerApprovalHandler();
        ApprovalHandler director = new DirectorApprovalHandler();
        ApprovalHandler vp = new VPApprovalHandler();

        // 一定要注意，是有流程顺序的
        manager.setSuccessor(director);
        director.setSuccessor(vp);

        // 具体业务处理
//        manager.approval(userName,fee);

    }

    // 内链处理方式
    private static void test02(String userName, double fee){
        // 确定有多少个流程节点
        ApprovalHandler manager = ApprovalHandler.getApprovalHandler();

        // 具体业务处理
//        manager.approval(userName,fee);

    }

    public static void main(String[] args) {
        String userName = "Allen2";
        double fee = 3800;

//        test01(userName,fee);

        test02(userName,fee);
    }

}
