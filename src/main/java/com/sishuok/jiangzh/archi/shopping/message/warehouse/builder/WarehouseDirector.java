package com.sishuok.jiangzh.archi.shopping.message.warehouse.builder;

import com.sishuok.jiangzh.archi.shopping.message.memento.MessageCaretaker;
import com.sishuok.jiangzh.archi.shopping.message.memento.MessageMemento;
import com.sishuok.jiangzh.archi.shopping.message.warehouse.enums.WarehouseMsgTypeEnum;

public class WarehouseDirector {

    private WarehouseBuilder warehouseBuilder;
    public WarehouseDirector(WarehouseBuilder warehouseBuilder){
        this.warehouseBuilder = warehouseBuilder;
    }

    // HO001-house01
    public String constructHO1(String houseId){
        MessageCaretaker caretaker = MessageCaretaker.createInstance();
        String key = WarehouseMsgTypeEnum.HO001.name()+houseId;
        MessageMemento messageMemento = caretaker.retriveMemento(key);
        if(messageMemento == null){
            String message = warehouseBuilder.getMessageType(
                    WarehouseMsgTypeEnum.HO001.name()).getHouseId(houseId).getMessage();

            // 记录到备忘录中
            MessageMemento newMessageMemento = new WarehouseDirectorMemento(message);
            caretaker.saveMemento(key, newMessageMemento);

            // 返回结果
            return message;
        }else{
            if(messageMemento instanceof WarehouseDirectorMemento){
                WarehouseDirectorMemento directorMemento = (WarehouseDirectorMemento)messageMemento;
                return directorMemento.getMessage();
            }else{
                // 抛出异常
                return "";
            }
        }
    }

    private class WarehouseDirectorMemento implements MessageMemento {
        private String message;
        public WarehouseDirectorMemento(String message){
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}

