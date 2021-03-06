package com.hhx.design.pattern.iterator;

/**
 * 可迭代接口
 *
 * @author hhx
 */
public interface Iterable<T> {
    /**
     * 获取迭代器
     * @return
     */
    Iterator<T> getIterator();
}
