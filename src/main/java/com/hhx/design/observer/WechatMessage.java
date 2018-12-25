package com.hhx.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义被观察者 , 微信订阅号
 *
 * @author hhx
 */
public class WechatMessage implements ObserverAble {

    /**
     * 订阅了公众号的观察者
     */
    private List<Observer> list;
    private String message;

    public WechatMessage() {
        list = new ArrayList<>();
    }

    public void setInfo(String s) {
        this.message = s;
        System.out.println("微信公众号发布文章： " + s);
        notifyObserver();
    }


    @Override
    public void registerObserver(Observer o) {
        // 添加订阅者
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // 移除订阅者
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        // 通知订阅者有新消息
        list.forEach(o -> o.update(this.message));
    }
}
