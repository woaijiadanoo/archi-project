package com.sishuok.jiangzh.archi.designs.template.impl;

public abstract class AbstrctTemplate {

    abstract void doPrimitiveOperation1();
    abstract void doPrimitiveOperation2();

    void templateMethod(){
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }

}
