package com.sishuok.jiangzh.archi.designs.strategy.demo.v1;

public class V1SoldGoodsMain {

    public static void main(String[] args) {
        String user = "Jiangzh";
        String role = describeUser(user);
        double price = 1000.0;
        // 用户画像：新用户，老用户，年轻人、工薪族、白领 ...
        if("新用户".equals(role)){
            price = price * (1 - 0.3);
        }else if("老用户".equals(role)){
            price = price * (1 - 0.05);
        }else if("学生用户".equals(role)){
            price = price * (1 - 0.25);
        }

        System.out.println("price = " + price);
    }

    public static String describeUser(String user){
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
