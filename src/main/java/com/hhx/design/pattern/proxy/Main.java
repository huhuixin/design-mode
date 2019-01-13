package com.hhx.design.pattern.proxy;

/**
 * 测试
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Interface proxy = new Proxy(new Target());
        proxy.method();
    }

}
