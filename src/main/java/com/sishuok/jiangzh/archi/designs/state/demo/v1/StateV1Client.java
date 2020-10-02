package com.sishuok.jiangzh.archi.designs.state.demo.v1;

import java.util.HashMap;
import java.util.Map;

public class StateV1Client {

    /*
        用户，满三百减二十
     */
    private static Map<String,String> dbMap = new HashMap<>();
    /*
        用户，一共领取了多少回
     */
    private static Map<String,Integer> numDBMap = new HashMap<>();

    private static void test01(String userName, String type){
        Integer oldNum = numDBMap.get(userName);
        // 判断初始化数据
        if(oldNum == null){
            oldNum = 1;
            numDBMap.put(userName, oldNum);
        }else{
            oldNum += 1;
            numDBMap.put(userName, oldNum);
        }

        String userType = dbMap.get(userName);
        if(userType == null){
            dbMap.put(userName, type);
        }
    }

    public static void main(String[] args) {
        String name = "Allen";
        String type = "满三百减二十";

        for(int i=0; i<10; i++){
            test01(name, type);
        }

    }

}
