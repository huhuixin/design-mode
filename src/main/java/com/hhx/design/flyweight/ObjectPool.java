package com.hhx.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象缓冲池
 *
 * @author hhx
 */
public abstract class ObjectPool<T extends CacheAble> {

    public final Map<String, T> MAP = new HashMap(16);

    public boolean add(T t){
        if(MAP.containsKey(t.getId())){
            return false;
        }
        MAP.put(t.getId(), t);
        return true;
    }

    public T get(String id){
        return MAP.get(id);
    }
}
