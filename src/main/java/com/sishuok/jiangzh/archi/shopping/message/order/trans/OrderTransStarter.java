package com.sishuok.jiangzh.archi.shopping.message.order.trans;

import com.sishuok.jiangzh.archi.shopping.message.order.trans.client.OrderTransClient;
import com.sishuok.jiangzh.archi.shopping.message.order.trans.server.OrderMessageServer;

public class OrderTransStarter {

    // 订单模块消息Server的端口号
    private static int port = 10086;
    // 仓储模块消息Server端口号
    private static int wareHousePort = 10010;

    public static void main(String[] args) {
        // 启动Server
        startServer(port);

        // 测试客户端
//        clientTest("order", wareHousePort);
    }

    private static void startServer(int port){
        OrderMessageServer messageServer = new OrderMessageServer();
        messageServer.openServer(port);
    }

    private static void clientTest(String message,int port){
        OrderTransClient client = new OrderTransClient(port);
        String response = client.sendMessage(message);
        System.out.println("response = " + response);
    }

}
