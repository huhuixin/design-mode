package com.hhx.design.singleton;

/**
 * 内部类
 * 线程安全
 * 延迟加载
 * 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance
 * @author hhx
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5 (){}
    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
