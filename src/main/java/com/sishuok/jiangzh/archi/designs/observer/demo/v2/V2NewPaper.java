package com.sishuok.jiangzh.archi.designs.observer.demo.v2;

import com.sishuok.jiangzh.archi.designs.observer.demo.v1.V1ObserverA;
import com.sishuok.jiangzh.archi.designs.observer.demo.v1.V1ObserverB;

/*
    出版社
 */
public class V2NewPaper extends V2NewsPaperRegister{

    private String newsPaperMessage;

    public String getNewsPaperMessage() {
        return newsPaperMessage;
    }

    /*
        报纸由印刷厂交给了出版社
     */
    public void setNewsPaperMessage(String newsPaperMessage) {
        this.newsPaperMessage = newsPaperMessage;
        // 将报纸信息传递给每一个订阅者
        this.notifyNewsPaper();
    }
}
