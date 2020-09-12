package com.sishuok.jiangzh.archi.designs.decorator.impl;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private String addedState;

    @Override
    public void operation() {
        super.operation();
    }

    public String getAddedState() {
        return addedState;
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }
}
