package com.sishuok.jiangzh.archi.designs.observer.demo.v1;

/*
    出版社
 */
public class V1NewPaper {

    /*
        报纸由印刷厂交给了出版社
     */
    public void getDaysNewsPaper(String message){
        // 将报纸直接交给每一个订阅者
        V1ObserverA a = new V1ObserverA();
        a.getNewsPaper(message);

        V1ObserverB b = new V1ObserverB();
        b.getNewsPaper(message);
    }

}
