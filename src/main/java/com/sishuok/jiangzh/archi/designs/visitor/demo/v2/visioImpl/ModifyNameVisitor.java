package com.sishuok.jiangzh.archi.designs.visitor.demo.v2.visioImpl;

import com.sishuok.jiangzh.archi.designs.visitor.demo.DemoVisitor;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2ECustomer;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2PCustomer;

public class ModifyNameVisitor implements DemoVisitor {
    @Override
    public void visioECustomer(V2ECustomer v2ECustomer) {
        System.out.println(v2ECustomer.name + "修改为: 蒋征");
    }

    @Override
    public void visioPCustomer(V2PCustomer v2PCustomer) {
        System.out.println(v2PCustomer.name + "修改为：私塾OK");
    }
}
