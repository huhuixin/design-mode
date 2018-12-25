package com.hhx.design.decorator.decorator;

import com.hhx.design.decorator.Component;
import com.hhx.design.decorator.Decorator;

/**
 * 具体装饰器A
 *
 * @author hhx
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorB Decorator .. ");
        getComponent().operation();
    }
}
