package com.hhx.design.pattern.decorator.decorator;

import com.hhx.design.pattern.decorator.Component;
import com.hhx.design.pattern.decorator.Decorator;

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
