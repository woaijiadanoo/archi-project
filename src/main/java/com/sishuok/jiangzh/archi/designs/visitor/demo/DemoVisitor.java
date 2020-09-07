package com.sishuok.jiangzh.archi.designs.visitor.demo;

import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2ECustomer;
import com.sishuok.jiangzh.archi.designs.visitor.demo.v2.V2PCustomer;
import com.sishuok.jiangzh.archi.designs.visitor.impl.ConeteElementA;
import com.sishuok.jiangzh.archi.designs.visitor.impl.ConeteElementB;

public interface DemoVisitor {

    void visioECustomer(V2ECustomer v2ECustomer);

    void visioPCustomer(V2PCustomer v2PCustomer);

}
