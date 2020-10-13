package com.sishuok.jiangzh.archi.shopping.message.warehouse.trans;

import com.sishuok.jiangzh.archi.shopping.message.order.trans.server.OrderMessageServer;
import com.sishuok.jiangzh.archi.shopping.message.warehouse.trans.client.WarehouseTransClient;

public class WarehouseTransStarter {

    // 订单模块消息Server的端口号
    private static int orderPort = 10086;
    // 仓储模块消息Server端口号
    private static int wareHousePort = 10010;

    public static void main(String[] args) {
//        String message = "Hello World";
//        clientTest(message, orderPort);

        // 启动warehouseServer
        startServer(wareHousePort);

    }

    private static void startServer(int port){
        OrderMessageServer messageServer = new OrderMessageServer();
        messageServer.openServer(port);
    }

    private static void clientTest(String message,int port){
        WarehouseTransClient client = new WarehouseTransClient(port);
        String response = client.sendMessage(message);
        System.out.println("response = " + response);
    }

}
