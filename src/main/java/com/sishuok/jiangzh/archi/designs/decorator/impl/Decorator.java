package com.sishuok.jiangzh.archi.designs.decorator.impl;

public abstract class Decorator extends Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
