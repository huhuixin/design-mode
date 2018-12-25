package com.hhx.design.proxy;

/**
 * 被代理对象
 *
 * @author hhx
 */
public class Target implements Interface {
    @Override
    public void method() {
        System.out.println("执行动作");
    }
}
