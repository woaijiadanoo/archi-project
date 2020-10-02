package com.sishuok.jiangzh.archi.designs.prototype.demo.v2;

import com.sishuok.jiangzh.archi.designs.prototype.demo.service.EnterpriseOrder;
import com.sishuok.jiangzh.archi.designs.prototype.demo.service.PrototypeOrderAPI;
import com.sishuok.jiangzh.archi.designs.prototype.demo.service.UserOrder;

public class PrototypeV2Client {

    public static void main(String[] args) {
        PrototypeOrderAPI orderAPI = null;
        try{
//            orderAPI = new UserOrder("Allen","001",2700);
            orderAPI = new EnterpriseOrder("sishuok","001",2800);
            insertDB(orderAPI);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void insertDB(PrototypeOrderAPI orderAPI){
        /*
            insert into sishu_order_t(name,orderId)
			values("allen", 1),("allen2", 2),("allen3", 3),("allen4", 4);

		    commit;
         */
        while (orderAPI.getOrderNum() > 1000){
            PrototypeOrderAPI newApi = orderAPI.clone();
            newApi.setOrderNum(1000);

            System.out.println("v2 不停循环插入：newApi num : "+ newApi.getOrderNum());
            orderAPI.setOrderNum(orderAPI.getOrderNum()-1000);
        }

        System.err.println("v2 最终插入剩余数量：orderAPI num : "+ orderAPI.getOrderNum());
    }

}
