package com.sishuok.jiangzh.archi.designs.visitor.demo.v2.visioImpl;

import com.sishuok.jiangzh.archi.designs.visitor.demo.DemoVisitor;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2ECustomer;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2PCustomer;

// 统计时长
public class VisitTimeVisitor implements DemoVisitor {
    @Override
    public void visioECustomer(V2ECustomer v2ECustomer) {
        // TODO 假装有一个非常复杂的业务场景
        System.out.println(v2ECustomer.name + ", 访问了10分钟");
    }

    @Override
    public void visioPCustomer(V2PCustomer v2PCustomer) {
        System.out.println(v2PCustomer.name + ", 访问了15分钟");
    }
}
