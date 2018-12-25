package com.hhx.design.observer;

/**
 * 微信用户 观察者
 * @author hhx
 */
public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
