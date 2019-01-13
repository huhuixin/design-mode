package com.hhx.design.pattern.iterator;

/**
 * 自定义迭代器
 *
 * @author hhx
 */
public interface Iterator<T> {
    /**
     * 是否有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    T next();
}
