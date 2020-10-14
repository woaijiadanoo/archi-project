package com.sishuok.jiangzh.archi.shopping.message.warehouse.builder;

import com.sishuok.jiangzh.archi.shopping.message.memento.MessageCaretaker;
import com.sishuok.jiangzh.archi.shopping.message.memento.MessageMemento;
import com.sishuok.jiangzh.archi.shopping.message.warehouse.enums.WarehouseMsgTypeEnum;

import java.util.List;

public class WarehouseDirector {

    private WarehouseBuilder warehouseBuilder;
    public WarehouseDirector(WarehouseBuilder warehouseBuilder){
        this.warehouseBuilder = warehouseBuilder;
    }

    private String preMessage(String messageType, String houseId){
        MessageCaretaker caretaker = MessageCaretaker.createInstance();
        String key = messageType+houseId;
        MessageMemento messageMemento = caretaker.retriveMemento(key);
        if(messageMemento == null){
            String message = warehouseBuilder.getMessageType(
                    messageType).getHouseId(houseId).getMessage();

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

    private String postMessage(String pre,List<String> detailOrders){
        StringBuffer sb = new StringBuffer();
        sb.append(warehouseBuilder.getComma().getMessage());
        for(String orderId : detailOrders){
            sb.append(warehouseBuilder.getOrderId(orderId).getMessage());
            sb.append(warehouseBuilder.getConnector().getMessage());
        }

        pre += sb.toString();
        // 去除最后一个连接符
        pre = pre.substring(0, pre.length()-1);

        return pre;
    }

    // HO001-house01
    public String constructHO1(String houseId){
        return preMessage(WarehouseMsgTypeEnum.HO001.name(), houseId);
    }

    public String constructHO2(String houseId){
        return preMessage(WarehouseMsgTypeEnum.HO002.name(), houseId);
    }

    public String constructHO3(String houseId){
        return preMessage(WarehouseMsgTypeEnum.HO003.name(), houseId);
    }

    // HO004-house01,order3|order1|order2
    public String constructHO4(String houseId, List<String> detailOrders){
        String pre = preMessage(WarehouseMsgTypeEnum.HO003.name(), houseId);

        return postMessage(pre,detailOrders);
    }

    public String constructHO5(String houseId, List<String> detailOrders){
        String pre = preMessage(WarehouseMsgTypeEnum.HO003.name(), houseId);

        return postMessage(pre,detailOrders);
    }

    public String constructHO6(String houseId, List<String> detailOrders){
        String pre = preMessage(WarehouseMsgTypeEnum.HO003.name(), houseId);

        return postMessage(pre,detailOrders);
    }

    public String constructHO7(String houseId, List<String> detailOrders){
        String pre = preMessage(WarehouseMsgTypeEnum.HO003.name(), houseId);

        return postMessage(pre,detailOrders);
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

