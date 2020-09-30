package com.sishuok.jiangzh.archi.designs.memento.impl;

public class Originator {

    // 表示Originator状态
    private String state = "";

    public Originator(String state){
        this.state = state;
    }



    public Memento createMemento(){
        return new MementoImpl(state);
    }

    public void setMemento(Memento memento){
        if(memento instanceof MementoImpl){
            MementoImpl impl = (MementoImpl)memento;
            this.state = impl.getState();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 核心部分
    private class MementoImpl implements Memento{
        /*
            表示要保存的内部状态
         */
        private String state;

        public MementoImpl(String state){
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

}
