package com.sishuok.jiangzh.archi.designs.observer.demo.v1;

public class ObserverV1Client {

    public static void main(String[] args) {
        String message = "sishuok万岁";
        V1NewPaper newPaper = new V1NewPaper();

        newPaper.getDaysNewsPaper(message);
    }

}
