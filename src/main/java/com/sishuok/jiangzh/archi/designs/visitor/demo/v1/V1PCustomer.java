package com.sishuok.jiangzh.archi.designs.visitor.demo.v1;

import com.sishuok.jiangzh.archi.designs.visitor.demo.Customer;
import com.sishuok.jiangzh.archi.designs.visitor.demo.DemoVisitor;

// 个人客户
public class V1PCustomer extends Customer {

    public V1PCustomer(String name){
        super(name);
    }

    @Override
    public void hotLine(String message) {
        System.out.println("个人客户："+ name + " , 访问了热线, 提出了： "+ message);
    }

    @Override
    public void analyze() {
        System.out.println("个人客户价值分析");
    }

    @Override
    public void accept(DemoVisitor demoVisitor) {

    }
}
