package com.sishuok.jiangzh.archi.designs.observer.demo.v2;

public class ObserverV2Client {

    public static void main(String[] args) {
        // 准备工作
        V2NewPaper v2NewPaper = new V2NewPaper();
        V2ObserverA observerA = new V2ObserverA();
        V2ObserverB observerB = new V2ObserverB();

        // 注册工作
        v2NewPaper.attach(observerA);
        v2NewPaper.attach(observerB);

        // 客户端
        String message = "Hello world";

        System.out.println("observer A message : "+observerA.getMessage());

        v2NewPaper.setNewsPaperMessage(message);

        System.out.println("observer A message : "+observerA.getMessage());
    }

}
