package com.sishuok.jiangzh.archi.designs.strategy.demo.v2;

public class PriceContext2 {

    private String user;

    public PriceContext2(String user){
        this.user = user;
    }

    public double quota(double price){
        PriceStrategy strategy = null;
        String role = describeUser(user);
        if("新用户".equals(role)){
            strategy = new NewUserStrategyImpl();
        }else if("老用户".equals(role)){
            strategy = new OldUserStrategyImpl();
        }else if("学生用户".equals(role)){
            strategy = new StudentUserStrategyImpl();
        }else{
            strategy = new OldUserStrategyImpl();
        }
        return strategy.calcPrice(price);
    }


    private String describeUser(String user){
        if("Allen".equals(user)){
            return "新用户";
        }else if("Jiangzh".equals(user)){
            return "老用户";
        }else if("sishuok".equals(user)){
            return "学生用户";
        }else{
            return "未知用户";
        }
    }

}
