package com.sishuok.jiangzh.archi.designs.composite.impl;

public class Composite extends Component{
    @Override
    public void someOperation() {
        // TODO
    }

    public Composite(String name){

    }

    @Override
    public void addChild(Component component) {
        super.addChild(component);
    }

    @Override
    public void removeChild(Component component) {
        super.removeChild(component);
    }

    @Override
    public Component getChildren(int index) {
        return super.getChildren(index);
    }
}
