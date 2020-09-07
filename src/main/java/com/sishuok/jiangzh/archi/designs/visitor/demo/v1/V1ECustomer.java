package com.sishuok.jiangzh.archi.designs.visitor.demo.v1;

import com.sishuok.jiangzh.archi.designs.visitor.demo.Customer;

// 企业客户
public class V1ECustomer extends Customer {

    public V1ECustomer(String name){
        super(name);
    }

    @Override
    public void hotLine(String message) {
        System.out.println("企业客户："+ name + " , 访问了热线, 提出了： "+ message);
    }

    @Override
    public void analyze() {
        System.out.println("企业客户价值分析");
    }

}
