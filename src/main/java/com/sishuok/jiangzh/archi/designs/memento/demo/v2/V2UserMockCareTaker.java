package com.sishuok.jiangzh.archi.designs.memento.demo.v2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class V2UserMockCareTaker {

    private UserMockMemento memento;

    public void saveMemento(UserMockMemento memento){
        this.memento = memento;
    }

    public UserMockMemento retriveMemento(){
        return memento;
    }

}
