package com.hhx.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录的保存者
 *
 * @author hhx
 */
public class CareTaker<T> {

    private List<IMemento<T>> mementoList = new ArrayList<>();

    /**
     * 保存备份
     * @param memento
     */
    public void add(IMemento<T> memento){
        mementoList.add(memento);
    }

    /**
     * 获取指定备份
     * @param index
     * @return
     */
    public T get(int index){
        return mementoList.get(index).get();
    }
}
