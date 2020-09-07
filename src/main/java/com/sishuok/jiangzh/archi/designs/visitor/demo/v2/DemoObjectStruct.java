package com.sishuok.jiangzh.archi.designs.visitor.demo.v2;

import com.sishuok.jiangzh.archi.designs.visitor.demo.Customer;
import com.sishuok.jiangzh.archi.designs.visitor.demo.DemoVisitor;
import com.sishuok.jiangzh.archi.designs.visitor.impl.Element;
import com.sishuok.jiangzh.archi.designs.visitor.impl.Visitor;

import java.util.ArrayList;
import java.util.List;

// 获取到了所有待操作的Element对象
public class DemoObjectStruct {

    private List<Customer> customers = new ArrayList<>();

    public void operation(DemoVisitor demoVisitor){
        for(Customer customer : customers){
            customer.accept(demoVisitor);
        }
    }

    public void addElement(Customer customer){
        customers.add(customer);
    }

}
