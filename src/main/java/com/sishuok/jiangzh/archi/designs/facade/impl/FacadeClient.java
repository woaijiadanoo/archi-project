package com.sishuok.jiangzh.archi.designs.facade.impl;

public class FacadeClient {

    public static void main(String[] args) {
        Facade facade = init();

        facade.print();
    }

    public static Facade init(){
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();

        Facade facade = new Facade();
        facade.setModuleA(moduleA);
        facade.setModuleB(moduleB);
        facade.setModuleC(moduleC);

        return facade;
    }

}
