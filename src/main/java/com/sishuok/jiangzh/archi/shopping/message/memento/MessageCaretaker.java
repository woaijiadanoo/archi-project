package com.sishuok.jiangzh.archi.shopping.message.memento;

import java.util.HashMap;
import java.util.Map;

public class MessageCaretaker {

    // 待记录的被保存对象
    private static Map<String, MessageMemento> mementoDB = new HashMap<>();
    // 单例模式
    private static MessageCaretaker caretaker = new MessageCaretaker();
    private MessageCaretaker(){}
    public static MessageCaretaker createInstance(){ return caretaker; }

    // 保存镜像快照
    public void saveMemento(String key,MessageMemento memento){
        mementoDB.put(key, memento);
    }

    // 恢复被保存的快照对象
    public MessageMemento retriveMemento(String key){
        System.out.println("retriveMemento key = " + key);
        return mementoDB.get(key);
    }

}
