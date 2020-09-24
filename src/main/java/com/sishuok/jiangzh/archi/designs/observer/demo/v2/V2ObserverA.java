package com.sishuok.jiangzh.archi.designs.observer.demo.v2;

public class V2ObserverA implements V2Observer{

    private String message;

    @Override
    public void getNewsPaper(V2NewsPaperRegister register) {
        if(register instanceof V2NewPaper){
            V2NewPaper v2NewPaper = (V2NewPaper)register;
            message = v2NewPaper.getNewsPaperMessage();
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
