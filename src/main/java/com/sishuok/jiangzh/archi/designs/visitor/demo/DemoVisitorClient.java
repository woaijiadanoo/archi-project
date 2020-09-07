package com.sishuok.jiangzh.archi.designs.visitor.demo;

import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.DemoObjectStruct;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2ECustomer;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2PCustomer;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.visioImpl.ModifyNameVisitor;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.visioImpl.VisitTimeVisitor;
import com.sishuok.jiangzh.archi.designs.visitor.impl.ObjectStruct;
import com.sishuok.jiangzh.archi.designs.visitor.impl.Visitor;

public class DemoVisitorClient {

    public static void main(String[] args) {
        DemoObjectStruct demoObjectStruct = new DemoObjectStruct();
        // 维护整个关系
        V2PCustomer pCustomer = new V2PCustomer("Allen");
        V2ECustomer eCustomer = new V2ECustomer("sishuok");
        demoObjectStruct.addElement(pCustomer);
        demoObjectStruct.addElement(eCustomer);

        // 添加额外方法
        // 1、统计用户时长
        DemoVisitor demoVisitor = new VisitTimeVisitor();
        demoObjectStruct.operation(demoVisitor);

        // 查看客户中文名称
        DemoVisitor demoVisitor1 = new ModifyNameVisitor();
        demoObjectStruct.operation(demoVisitor1);

    }

}
