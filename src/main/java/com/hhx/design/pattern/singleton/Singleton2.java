package com.hhx.design.pattern.singleton;

/**
 * 懒汉式
 * 线程不安全
 * @author hhx
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;
    private Singleton2 (){}
    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
