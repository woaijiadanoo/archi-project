package com.sishuok.jiangzh.archi.shopping.message.warehouse.trans.client;

import java.io.*;
import java.net.Socket;

public class WarehouseTransClient {

    private int serverPort;
    public WarehouseTransClient(int serverPort){
        this.serverPort = serverPort;
    }

    public String sendMessage(String str){
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            socket = new Socket("localhost", serverPort);

            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            socket.getOutputStream()
                    )
            );

            oos.writeObject(str);
            oos.flush();

            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            socket.getInputStream()
                    )
            );

            Object response = ois.readObject();
            System.out.println("server response message : "+ response);

            return response+"";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                close(socket,ois,oos);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
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
