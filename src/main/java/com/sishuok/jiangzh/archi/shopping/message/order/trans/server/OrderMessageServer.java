package com.sishuok.jiangzh.archi.shopping.message.order.trans.server;

import com.sishuok.jiangzh.archi.shopping.message.order.state.OrderMessageContext;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class OrderMessageServer {

    public void openServer(int port){
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            Object obj = null;
            while (true){
                Socket socket = serverSocket.accept();
                ObjectInputStream ois = new ObjectInputStream(
                  new BufferedInputStream(socket.getInputStream())
                );

                obj = ois.readObject();

                // 假设接收到报文以后，直接存入数据库
                System.out.println("接收到信息：" + obj + " , 并且已经存入数据库");

                String responseMessage = requestHandler(obj + "");

                ObjectOutputStream oos = new ObjectOutputStream(
                        new BufferedOutputStream(socket.getOutputStream())
                );

                oos.writeObject(responseMessage);
                oos.flush();

                // 关闭通道
                close(socket,ois,oos);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private String requestHandler(String requestMessage){
        OrderMessageContext context = new OrderMessageContext();

        return context.contextRequest(requestMessage);
    }

    private void close(Socket socket, ObjectInputStream ois, ObjectOutputStream oos) throws IOException {
        if(ois != null){
            ois.close();
        }
        if(oos != null){
            oos.close();
        }
        if(socket != null){
            socket.close();
        }
    }

}
