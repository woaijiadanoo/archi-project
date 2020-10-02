package com.sishuok.jiangzh.archi.designs.chain.demo.v1;

public class ChainV1Client {

    private static void test01(String userName, double fee){
        if(fee <= 1000){
            manager(userName, fee);
        }else if(fee <= 2000){
            System.out.println(userName + " , 总监审批通过");
        }else if(fee <= 50000){
            System.out.println(userName + " , VP审批通过");
        }
    }

    private static void manager(String userName, double fee){
        if("Allen".equals(userName)){
            System.out.println(userName + " , 部门负责人审批通过");
        }else{
            System.out.println(userName + " , 部门负责人审批不通过");
        }
    }

    public static void main(String[] args) {
        String userName = "Allen2";
        double fee = 800;

        test01(userName,fee);
    }

}
