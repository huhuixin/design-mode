package com.hhx.design.decorator;

import com.hhx.design.decorator.decorator.ConcreteDecoratorA;
import com.hhx.design.decorator.decorator.ConcreteDecoratorB;

/**
 * 使用装饰器
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        // 形成了一个装饰链
        Component component = new ConcreteDecoratorA(new ConcreteComponent());
        component = new ConcreteDecoratorB(component);
        component.operation();
    }

}
