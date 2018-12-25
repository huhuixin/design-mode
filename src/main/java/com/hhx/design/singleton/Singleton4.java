package com.hhx.design.singleton;

/**
 * 懒汉式 - 双重同步锁
 * 线程安全
 * @author hhx
 */
public class Singleton4 {
    private volatile static Singleton4 INSTANCE;
    private Singleton4(){}
    public static synchronized Singleton4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
