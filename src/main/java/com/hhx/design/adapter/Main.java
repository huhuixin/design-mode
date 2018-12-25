package com.hhx.design.adapter;

/**
 * 适配器测试
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
