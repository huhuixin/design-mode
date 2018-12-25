package com.hhx.design.proxy;

/**
 * 代理对象
 * @author hhx
 */
public class Proxy implements Interface{

    private Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public void method() {
        target.method();
    }
}
