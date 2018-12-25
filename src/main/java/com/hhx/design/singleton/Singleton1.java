package com.hhx.design.singleton;

/**
 * 饿汉式
 * 线程安全
 * 类加载时就初始化，浪费内存
 * @author hhx
 */
public class Singleton1 {
    private static Singleton1 INSTANCE = new Singleton1();
    private Singleton1 (){}
    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
