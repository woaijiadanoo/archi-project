package com.sishuok.jiangzh.archi.designs.facade.impl;

public class Facade {

    private ModuleA moduleA;
    private ModuleB moduleB;
    private ModuleC moduleC;

    public void print(){
        moduleA.print();
        moduleB.print();
        moduleC.print();
    }


    public void setModuleA(ModuleA moduleA) {
        this.moduleA = moduleA;
    }

    public void setModuleB(ModuleB moduleB) {
        this.moduleB = moduleB;
    }

    public void setModuleC(ModuleC moduleC) {
        this.moduleC = moduleC;
    }
}
