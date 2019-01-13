package com.hhx.design.pattern.singleton;

/**
 * 实现单例模式的最佳方法  -   枚举实现
 * 避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 * @author hhx
 */
public enum Singleton6 {
    /**
     * 单例
     */
    INSTANCE;
}
