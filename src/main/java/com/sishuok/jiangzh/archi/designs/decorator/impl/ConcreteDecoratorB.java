package com.sishuok.jiangzh.archi.designs.decorator.impl;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void addedBehavior(){
        // TODO
    }

    @Override
    public void operation() {
        addedBehavior();
        super.operation();
        addedBehavior();
    }
}
