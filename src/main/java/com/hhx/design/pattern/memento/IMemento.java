package com.hhx.design.pattern.memento;

/**
 * 备忘录接口
 *
 * @author hhx
 */
public interface IMemento<T> {

    /**
     * 获取备忘实例
     * @return
     */
    T get();
}
