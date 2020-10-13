package com.sishuok.jiangzh.archi.designs.proxy.demo.dymic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    // 真实目标对象
    private Object target;

    public Object getProxyInstance(Object target){
        this.target = target;

        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );

        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method before");

        // 调用真实对象的相应的方法
        method.invoke(target, args);

        System.out.println("method after");

        return null;
    }
}
