package com.hhx.design.pattern.flyweight;

/**
 * 实现 对象缓冲池
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        UserPool pool = new UserPool();
        for (int i = 0; i < 30; i++) {
            String id = Integer.toString(12);
            User user = pool.get(id);
            if(user == null){
                user = new User(id);
                pool.add(user);
            }
        }
        pool.MAP.forEach((k,v) -> System.out.println(k + ": " + v.getId()));
    }
}
