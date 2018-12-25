package com.hhx.design.singleton;

/**
 * 懒汉式 - 同步锁
 * 线程不安全
 * @author hhx
 */
public class Singleton3 {
    private static Singleton3 INSTANCE;
    private Singleton3 (){}
    public static synchronized Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
