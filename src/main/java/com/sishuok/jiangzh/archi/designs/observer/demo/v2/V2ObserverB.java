package com.sishuok.jiangzh.archi.designs.observer.demo.v2;

public class V2ObserverB implements V2Observer{

    @Override
    public void getNewsPaper(V2NewsPaperRegister register) {
        if(register instanceof V2NewPaper){
            V2NewPaper v2NewPaper = (V2NewPaper)register;
            // 将信息消息写入数据库留存
            System.out.println("V2ObserverB将消息存入数据库 message = " + v2NewPaper.getNewsPaperMessage());
        }
    }

}
